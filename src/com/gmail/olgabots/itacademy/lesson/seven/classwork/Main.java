package com.gmail.olgabots.itacademy.lesson.seven.classwork;

import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.figure.Rectangle;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.figure.Square;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student.Man;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student.Student;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.TaskService;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl.TaskOneServiceImpl;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl.TaskThreeServiceImpl;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl.TaskTwoServiceImpl;
import com.gmail.olgabots.itacademy.lesson.six.homework.string.TaskTwo;

public class Main {

    public static void main(String[] args) {


        TaskService taskServiceOne = new TaskOneServiceImpl();
        TaskService taskServiceTwo = new TaskTwoServiceImpl();
        TaskService taskServiceThree = new TaskThreeServiceImpl();

        TaskService[] taskServices = {taskServiceOne, taskServiceTwo, taskServiceThree};

        for (TaskService taskService : taskServices) {
            taskService.runTask();
        }

    }
}
