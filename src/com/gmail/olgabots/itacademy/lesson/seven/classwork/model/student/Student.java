package com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student;

import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.student.Man;

public class Student extends Man {

    private int yearOfStudy;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseYearOfStudy(int countOfYears) {
        this.yearOfStudy += countOfYears;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student{" +
                "yearOfStudy=" + yearOfStudy +
                '}';
    }
}
