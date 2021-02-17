package com.shindorim.financialservices;

import com.shindorim.financialservices.account.AccountRepository;
import com.shindorim.financialservices.account.AccountService;
import com.shindorim.financialservices.account.AccountServiceImpl;
import com.shindorim.financialservices.account.MemoryAccountRepository;
import com.shindorim.financialservices.member.MemberRepository;
import com.shindorim.financialservices.member.MemberService;
import com.shindorim.financialservices.member.MemberServiceImpl;
import com.shindorim.financialservices.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public AccountService accountService() {
        System.out.println("AppConfig.accountService");
        return new AccountServiceImpl(accountRepository());
    }

    @Bean
    public AccountRepository accountRepository() {
        System.out.println("AppConfig.accountRepository");
        return new MemoryAccountRepository();
    }
}
