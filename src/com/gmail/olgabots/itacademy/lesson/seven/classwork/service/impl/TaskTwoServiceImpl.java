package com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.figure.Rectangle;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.figure.Square;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.TaskService;

public class TaskTwoServiceImpl implements TaskService {
    @Override
    public void runTask() {
        Rectangle rectangle = new Rectangle(23, 2);
        Square square = new Square(98);

        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());
    }
}
