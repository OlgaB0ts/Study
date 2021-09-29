package com.gmail.olgabots.itacademy.lesson.seven.classwork;

public class Main {

    public static void main(String[] args) {
        Man manFirst = new Man();
        manFirst.setAge(45);
        manFirst.setName("Ivan");

        Student studentFirst = new Student();
        studentFirst.setYearOfStudy(7);
        studentFirst.setAge(28);
        studentFirst.setName("Polina");

        System.out.println(studentFirst);
        System.out.println(manFirst);

        Rectangle rectangle = new Rectangle(23, 2);
        Square square = new Square(98);

        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());

    }
}
