package com.example.taskmanager;

import org.springframework.stereotype.Component;

@Component
public class TaskService {
    public void addTask(String taskName, String deadline) {
        System.out.println("Task Added: " + taskName + ", Deadline: " + deadline);
    }

    public void completeTask(String taskName) {
        System.out.println("Task Completed: " + taskName);
    }
}
