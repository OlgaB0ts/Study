package com.gmail.olgabots.itacademy.lesson.eight.service.impl;

import com.gmail.olgabots.itacademy.lesson.eight.model.DayOfWeek;
import com.gmail.olgabots.itacademy.lesson.eight.service.TaskService;

import java.util.Random;

public class TaskServiceTwoImpl implements TaskService {

    public static final int FROM_WEEK_OF_DAY = 1;
    private Random random = new Random();

    @Override
    public void runService() {

        int randomWeekDay = random.nextInt(DayOfWeek.values().length - FROM_WEEK_OF_DAY) + FROM_WEEK_OF_DAY;
        System.out.println("Random week day number is " + randomWeekDay);
        DayOfWeek dayOfWeekByNumber = getDayOfWeekByNumber(randomWeekDay);
        System.out.println(dayOfWeekByNumber);
    }

    private DayOfWeek getDayOfWeekByNumber(int randomWeekDay) {
        DayOfWeek randomDayOfWeek = null;
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getNumber() == randomWeekDay) {
                randomDayOfWeek = dayOfWeek;
                break;
            }
        }
        return randomDayOfWeek;
    }
}
