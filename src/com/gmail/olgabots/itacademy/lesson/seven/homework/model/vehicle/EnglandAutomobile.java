package com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle;

public class EnglandAutomobile extends Automobile {
    private static final String COUNTRY_NAME = "England";

    @Override
    public int getRate() {
        return Automobile.RATE_MIDDLE;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " My country - " + COUNTRY_NAME + "."
                + " Auto rate - " + getRate();
    }
}
