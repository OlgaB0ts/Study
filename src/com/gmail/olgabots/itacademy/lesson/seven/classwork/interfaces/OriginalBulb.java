package com.gmail.olgabots.itacademy.lesson.seven.classwork.interfaces;

public class OriginalBulb implements LightBulbControl {
    @Override
    public void on() {
        System.out.println("Original on");
    }

    @Override
    public void off() {
        System.out.println("Original off");
    }
}
