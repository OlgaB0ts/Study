package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Circle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Figure;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Rectangle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Triangle;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskService;


public class TaskOneServiceImpl implements TaskService {

    @Override
    public void runTask() {
        Figure[] figures = createFigures();

        printFigureInfo(figures);

        double sumOfPerimeters = getSumOfPerimeters(figures);

        printSumOfPerimeters(sumOfPerimeters);
    }

    private void printSumOfPerimeters(double sumOfPerimeters) {
        String formattedSumOfPerimeters = String.format("%.2f", sumOfPerimeters);
        String infoMessage = "Sum of the perimeters of the figures " + formattedSumOfPerimeters;

        System.out.println(infoMessage);
    }

    private Figure[] createFigures() {
        Rectangle figureOne = new Rectangle();
        figureOne.setWeight(9);
        figureOne.setHeight(3);

        Circle figureTwo = new Circle();
        figureTwo.setRadius(8);

        Triangle figureThree = new Triangle();
        figureThree.setFirstSideLength(2);
        figureThree.setSecondSideLength(4);
        figureThree.setThirdSideLength(7);

        Circle figureFour = new Circle();
        figureFour.setRadius(5);

        Triangle figureFife = new Triangle();
        figureFife.setFirstSideLength(8);
        figureFife.setSecondSideLength(4);
        figureFife.setThirdSideLength(6);

        Figure[] figures = {figureOne, figureTwo, figureThree, figureFour, figureFife};
        return figures;
    }

    private double getSumOfPerimeters(Figure[] figures) {
        double sumOfPerimeters = 0;
        for (Figure figure : figures) {
            sumOfPerimeters += figure.getPerimeter();
        }
        return sumOfPerimeters;
    }

    private void printFigureInfo(Figure[] figures) {
        System.out.println("Figures:");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String info = "Task one\n\n" +
                "a) Write the \"Figure\" class hierarchy.\n" +
                "b) The figure is extended with the classes Triangle, Rectangle, Circle.\n" +
                "c) Implement a method for calculating the area for each type of figure and calculating the perimeter.\n" +
                "d) Create an array of 5 Figures.\n" +
                "e) Display the sum of the perimeter of all Figures in the array.\n";

        return info;
    }
}
