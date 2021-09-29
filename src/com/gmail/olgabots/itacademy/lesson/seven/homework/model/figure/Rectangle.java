package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure.Figure;

public class Rectangle extends Figure {
    private int weight;
    private int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (weight + height) * 2;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
