package com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.impl;

import com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.TaskService;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceListIm implements TaskService {


    @Override
    public void runTask() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list.get(5));
        System.out.println(list);
        for (Integer element : list) {

        }
    }
}
