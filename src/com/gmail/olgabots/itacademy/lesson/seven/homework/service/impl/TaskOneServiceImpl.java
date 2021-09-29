package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Cicle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Figure;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Rectangle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Triangle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskOneService;

import java.text.NumberFormat;

public class TaskOneServiceImpl implements TaskOneService {

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(9, 3);
        figures[1] = new Cicle(8);
        figures[2] = new Triangle(2, 4, 7);
        figures[3] = new Cicle(9);
        figures[4] = new Triangle(2, 1, 8);

        double sumOfPerimeters = 0;
        for (Figure figure : figures) {
            sumOfPerimeters += figure.getPerimeter();
        }

        String formattedSumOfPerimeters = NumberFormat.getNumberInstance().format(sumOfPerimeters);
        System.out.println("Sum of all figure perimeters " + formattedSumOfPerimeters);
    }
}
