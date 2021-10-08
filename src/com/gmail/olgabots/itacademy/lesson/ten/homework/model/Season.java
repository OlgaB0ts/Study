package com.gmail.olgabots.itacademy.lesson.ten.homework.model;

public enum Season {
    SUMMER("Summer", "92"),
    AUTUMN("Autumn", "91"),
    WINTER("Winter", "90 or 91 (leap year)"),
    SPRING("Spring", "91");


    private String description;
    private String countOfDaysStr;

    Season(String description, String countOfDays) {
        this.description = description;
        this.countOfDaysStr = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public String getCountOfDaysStr() {
        return countOfDaysStr;
    }

    @Override
    public String toString() {
        return "Season{" +
                "description='" + description + '\'' +
                ", countOfDays=" + countOfDaysStr +
                '}';
    }
}
