package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

public class Cicle extends Figure {
    private int radius;

    public Cicle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Cicle{" +
                "radius=" + radius +
                '}';
    }
}
