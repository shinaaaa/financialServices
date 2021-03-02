package com.shindorim.financialservices.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final TaskServiceImpl taskService;

    @Autowired
    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/task/deposit")
    public String deposit(Task task) {
        taskService.deposit(task);
        return "200";
    }

    @PostMapping("/task/withdraw")
    public String withdraw(Task task) {
        taskService.withdraw(task);
        return "200";
    }

    @PostMapping("/task/remit")
    public String remit(Task task) {
        taskService.remit(task);
        return "200";
    }
}
