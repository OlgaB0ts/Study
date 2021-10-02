package com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle;

public class RussianAutomobile extends Automobile {
    private static final String COUNTRY_NAME = "Russian";

    @Override
    public int getRate() {
        return Automobile.RATE_LOW;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " My country - " + COUNTRY_NAME + "."
                + " Auto rate - " + getRate();
    }
}
