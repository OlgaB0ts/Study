package com.gmail.olgabots.examclouds.lesson.nine;

class A {
    private final int getResult(int a, int b) {
        return 0;
    }
}

class B extends A {
    public int getResult(int a, int b) {
        return 1;
    }
}

public class Test {
    public static void main(String args[]) {
        B b = new B();
        System.out.println("x = " + b.getResult(0, 1));
    }
}

