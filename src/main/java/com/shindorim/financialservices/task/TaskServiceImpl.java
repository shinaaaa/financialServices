package com.shindorim.financialservices.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * 입금하기
     *
     * @param task 거래정보
     */
    @Override
    public void deposit(Task task) {
        taskRepository.deposit(task);
    }

    /**
     * 인출하기
     *
     * @param task 거래정보
     */
    @Override
    public void withdraw(Task task) {

    }

    /**
     * 송금하기
     *
     * @param task 거래정보
     */
    @Override
    public void remit(Task task) {

    }
}
