package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.Automobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.EnglandAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.GermanyAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.RussianAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskTwoService;

public class TaskTwoServiceImpl implements TaskTwoService {

    public static void main(String[] args) {
        Automobile[] automobiles = new Automobile[3];
        automobiles[0] = new GermanyAutomobile();
        automobiles[1] = new EnglandAutomobile();
        automobiles[2] = new RussianAutomobile();

        for (Automobile automobile : automobiles) {
            System.out.println(automobile.getDescription());
        }
    }
}
