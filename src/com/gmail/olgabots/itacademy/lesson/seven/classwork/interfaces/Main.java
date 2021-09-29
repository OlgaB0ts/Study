package com.gmail.olgabots.itacademy.lesson.seven.classwork.interfaces;

public class Main {
    public static void main(String[] args) {
        LightBulbControl[] bulbs = {new OriginalBulb(), new XiaomiBulb(), new OriginalBulb(), new XiaomiBulb()};
        for (LightBulbControl bulb : bulbs) {
            bulb.on();
        }

        for (LightBulbControl bulb : bulbs) {
            bulb.off();
        }
    }


}
