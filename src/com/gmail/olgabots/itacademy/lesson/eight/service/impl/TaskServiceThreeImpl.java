package com.gmail.olgabots.itacademy.lesson.eight.service.impl;

import com.gmail.olgabots.itacademy.lesson.eight.model.Role;
import com.gmail.olgabots.itacademy.lesson.eight.service.TaskService;

public class TaskServiceThreeImpl implements TaskService {

    @Override
    public void runService() {
        for (Role role : Role.values()) {
            System.out.println(role);
        }
    }
}
