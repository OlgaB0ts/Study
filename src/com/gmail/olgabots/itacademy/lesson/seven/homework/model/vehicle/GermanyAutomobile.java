package com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.Automobile;

public class GermanyAutomobile extends Automobile {
    private static final String COUNTRY_NAME = "Germany";

    @Override
    public int getRate() {
        return Automobile.RATE_HEIGHT;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country - " + COUNTRY_NAME + ". Auto rate - " + getRate();
    }
}
