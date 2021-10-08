package com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl;

import com.gmail.olgabots.itacademy.lesson.ten.homework.model.Season;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.TaskService;

public class TaskServiceOneImpl implements TaskService {

    @Override
    public void runService() {
        System.out.println("__________Task one__________");
        Season[] seasons = Season.values();

        System.out.println("List of seasons:");
        for (Season season : seasons) {
            System.out.println(season);
        }
    }
}
