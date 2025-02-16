package com.example.taskmanager;

import org.springframework.stereotype.Component;

@Component
public class PriorityService {
    public String assignPriority(String task) {
        return task + " is assigned High Priority!";
    }
}
