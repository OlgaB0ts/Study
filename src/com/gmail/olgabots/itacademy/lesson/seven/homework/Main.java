package com.gmail.olgabots.itacademy.lesson.seven.homework;


import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskService;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl.TaskOneServiceImpl;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl.TaskThreeServiceImpl;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl.TaskTwoServiceImpl;

public class Main {
    public static void main(String[] args) {
        TaskService taskOne = new TaskOneServiceImpl();
        TaskService taskTwo = new TaskTwoServiceImpl();
        TaskService taskThree = new TaskThreeServiceImpl();

        TaskService[] services = {taskOne, taskTwo, taskThree};
        for (TaskService service : services) {
            System.out.println(service);
            service.runTask();
            System.out.println("______________________________");
        }
    }
}
