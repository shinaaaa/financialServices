package com.shindorim.financialservices;

import com.shindorim.financialservices.account.*;
import com.shindorim.financialservices.member.JpaMemberRepository;
import com.shindorim.financialservices.member.MemberRepository;
import com.shindorim.financialservices.member.MemberService;
import com.shindorim.financialservices.member.MemberServiceImpl;
import com.shindorim.financialservices.task.MemoryTaskRepository;
import com.shindorim.financialservices.task.TaskRepository;
import com.shindorim.financialservices.task.TaskService;
import com.shindorim.financialservices.task.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class AppConfig {

    private final EntityManager entityManager;

    @Autowired
    public AppConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new JpaMemberRepository(entityManager);
    }

    @Bean
    public AccountService accountService() {
        System.out.println("AppConfig.accountService");
        return new AccountServiceImpl(accountRepository());
    }

    @Bean
    public AccountRepository accountRepository() {
        System.out.println("AppConfig.accountRepository");
        return new JpaAccountRepository(entityManager);
    }

    @Bean
    public TaskService taskService() {
        System.out.println("AppConfig.taskService");
        return new TaskServiceImpl(taskRepository());
    }

    @Bean
    public TaskRepository taskRepository() {
        System.out.println("AppConfig.taskRepository");
        return new MemoryTaskRepository();
    }
}
