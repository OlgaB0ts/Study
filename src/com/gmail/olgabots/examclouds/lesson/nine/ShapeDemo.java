package com.gmail.olgabots.examclouds.lesson.nine;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("rad", 6, 7, 30);
        Shape circleTwo = new Circle("white", 5, 7, 3);
        Shape circleThree = new Circle("white", 5, 7, 3);
        Shape rectangle = new Rectangle("black", 3, 3, 23, 23);
        Shape rectangleTwo = new Rectangle("orange", 3, 5, 2, 17);

        Shape[] shapes = {circle, circleTwo, rectangleTwo, rectangle};

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }

        System.out.println(circle.equals(circleTwo));
        System.out.println(circleTwo.equals(circleThree));
    }
}
