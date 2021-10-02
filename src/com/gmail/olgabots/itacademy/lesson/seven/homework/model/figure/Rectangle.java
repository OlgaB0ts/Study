package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

public class Rectangle extends Figure {
    private Integer weight;
    private Integer height;

    @Override
    public double getPerimeter() {
        return (weight + height) * 2;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
