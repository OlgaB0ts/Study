package com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle;

public abstract class Automobile {
    public static final int RATE_HEIGHT = 5;
    public static final int RATE_MIDDLE = 3;
    public static final int RATE_LOW = 2;

    public abstract int getRate();

    public String getDescription() {
        return "Automobile:";
    }
}
