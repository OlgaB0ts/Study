package com.gmail.olgabots.itacademy.lesson.seven.classwork;

public class Rectangle extends Figure {
    int weight;
    int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return (weight + height) * 2;
    }

}
