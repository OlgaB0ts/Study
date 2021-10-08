package com.gmail.olgabots.examclouds.lesson.nine;

public class Aspirant extends Student{
    @Override
    public double getScholarship() {
        return getAvgMark() == 5? 100: 80;
    }
}
