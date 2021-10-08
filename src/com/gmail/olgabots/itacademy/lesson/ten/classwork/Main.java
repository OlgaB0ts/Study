package com.gmail.olgabots.itacademy.lesson.ten.classwork;

import com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.impl.TaskServiceHouseImpl;
import com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.impl.TaskServiceListIm;
import com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.TaskService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TaskServiceHouseImpl serviceHouse = new TaskServiceHouseImpl();
        TaskServiceListIm serviceListIm = new TaskServiceListIm();

        var services = List.of(serviceHouse, serviceListIm);


        for (TaskService service : services) {
            service.runTask();
        }
    }
}
