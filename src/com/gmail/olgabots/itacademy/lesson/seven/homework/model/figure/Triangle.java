package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Figure;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area = Math.sqrt(halfPerimeter
                * (halfPerimeter - firstSide)
                * (halfPerimeter - secondSide)
                * (halfPerimeter - thirdSide));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }
}
