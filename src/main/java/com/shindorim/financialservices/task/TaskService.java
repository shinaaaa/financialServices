package com.shindorim.financialservices.task;

public interface TaskService {
    void deposit(Task task);

    void withdraw(Task task);

    void remit(Task task);
}
