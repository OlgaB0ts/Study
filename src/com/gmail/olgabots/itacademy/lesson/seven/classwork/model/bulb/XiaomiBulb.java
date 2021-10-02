package com.gmail.olgabots.itacademy.lesson.seven.classwork.model.bulb;

public class XiaomiBulb  implements OnOffControllable {
    @Override
    public void on() {
        System.out.println("Xiaomi on");
    }

    @Override
    public void off() {
        System.out.println("Xiaomi off");
    }
}
