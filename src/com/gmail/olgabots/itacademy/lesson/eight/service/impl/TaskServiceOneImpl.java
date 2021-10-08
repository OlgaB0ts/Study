package com.gmail.olgabots.itacademy.lesson.eight.service.impl;

import com.gmail.olgabots.itacademy.lesson.eight.service.TaskService;

import java.util.Arrays;
import java.util.Random;

public class TaskServiceOneImpl implements TaskService {
    @Override
    public void runService() {

        int masLength = 8;
        int mas[] = new int[masLength];
        Random random = new Random();
        for (int i = 0; i < masLength; i++) {
            mas[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(mas));
    }
}
