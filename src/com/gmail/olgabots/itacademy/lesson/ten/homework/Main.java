package com.gmail.olgabots.itacademy.lesson.ten.homework;

import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.RandomService;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.TaskService;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl.TaskServiceOneImpl;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl.TaskServiceThreeImpl;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl.TaskServiceTwoImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RandomService randomService = new RandomService();
        TaskService serviceOne = new TaskServiceOneImpl();
        TaskService serviceTwo = new TaskServiceTwoImpl(randomService);
        TaskService serviceThree = new TaskServiceThreeImpl(randomService);

        var services = List.of(serviceOne, serviceTwo, serviceThree);

        for (TaskService service : services) {
            service.runService();
        }
    }
}
