package com.gmail.olgabots.examclouds.lesson.nine;

import java.util.Objects;

public class Circle extends Shape {
    private int x, y, radius;


    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Drawing circle with " + super.getColor() +
                        ", x= " + this.getX() +
                        ", y= " + getY()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
