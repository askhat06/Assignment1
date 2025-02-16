package com.example;

import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.taskmanager.TaskService;
import com.example.taskmanager.PriorityService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TaskService taskService = context.getBean(TaskService.class);
        PriorityService priorityService = context.getBean(PriorityService.class);

        taskService.addTask("Complete Spring project", "2025-02-20");
        System.out.println(priorityService.assignPriority("Complete Spring project"));

        context.close();
    }
}