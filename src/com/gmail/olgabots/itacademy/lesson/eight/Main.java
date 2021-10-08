package com.gmail.olgabots.itacademy.lesson.eight;

import com.gmail.olgabots.itacademy.lesson.eight.service.TaskService;
import com.gmail.olgabots.itacademy.lesson.eight.service.impl.TaskServiceThreeImpl;

public class Main {

    public static void main(String[] args) {
        TaskService taskServiceOne = new com.gmail.olgabots.itacademy.lesson.eight.service.impl.TaskServiceOneImpl();
        com.gmail.olgabots.itacademy.lesson.eight.service.impl.TaskServiceTwoImpl taskTwoService = new com.gmail.olgabots.itacademy.lesson.eight.service.impl.TaskServiceTwoImpl();

        TaskService[] services = {taskServiceOne, taskTwoService, new TaskServiceThreeImpl()};
        for (TaskService service : services) {
            service.runService();
        }
    }
}
