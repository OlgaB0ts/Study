package com.gmail.olgabots.itacademy.lesson.seven.classwork.interfaces;

public class XiaomiBulb  implements LightBulbControl{
    @Override
    public void on() {
        System.out.println("Xiaomi on");
    }

    @Override
    public void off() {
        System.out.println("Xiaomi off");
    }
}
