package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

public class Circle extends Figure {
    private Integer radius;

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int radius) {

        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
