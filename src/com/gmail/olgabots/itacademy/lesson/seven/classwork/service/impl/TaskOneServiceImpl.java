package com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student.Man;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student.Student;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.TaskService;

public class TaskOneServiceImpl implements TaskService {

    @Override
    public void runTask() {

        Man manFirst = new Man();
        manFirst.setAge(45);
        manFirst.setName("Ivan");

        Student studentFirst = new Student();
        studentFirst.setYearOfStudy(7);
        studentFirst.setAge(28);
        studentFirst.setName("Polina");

        System.out.println(studentFirst);
        System.out.println(manFirst);

    }
}
