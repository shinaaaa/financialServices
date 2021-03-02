package com.shindorim.financialservices.task;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class JpaTaskRepository implements TaskRepository {

    private final EntityManager entityManager;

    public JpaTaskRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void deposit(Task task) {
        Date time = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        task.setDate(dateFormat.format(time));

        entityManager.persist(task);

        entityManager.createQuery("update Account a set a.balance = :amount where a.account_num = :sender")
                .setParameter("amount", task.getAmount())
                .setParameter("sender", task.getSender())
                .executeUpdate();
    }

    @Override
    public void withdraw(Task task) {

    }

    @Override
    public void remit(Task task) {

    }
}
