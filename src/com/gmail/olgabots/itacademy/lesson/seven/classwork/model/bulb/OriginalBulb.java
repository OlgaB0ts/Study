package com.gmail.olgabots.itacademy.lesson.seven.classwork.model.bulb;

public class OriginalBulb implements OnOffControllable {
    @Override
    public void on() {
        System.out.println("Original on");
    }

    @Override
    public void off() {
        System.out.println("Original off");
    }
}
