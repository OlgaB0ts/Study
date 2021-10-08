package com.gmail.olgabots.examclouds.lesson.nine;

public class Student {
    private String name;
    private int avgMark;

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScholarship() {
        return avgMark == 5? 100: 80;
    }

}
