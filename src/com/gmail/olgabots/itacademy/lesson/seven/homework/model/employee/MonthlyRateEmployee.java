package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class MonthlyRateEmployee extends Employee {

    private Double monthlyRateValue;

    @Override
    public double getMonthSalary() {
        return monthlyRateValue;
    }

    public void setMonthlyRateValue(Double monthlyRateValue) {
        this.monthlyRateValue = monthlyRateValue;
    }

    @Override
    public String toString() {
        return "MonthlyRateEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", post='" + getPost() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", monthlyRateValue=" + monthlyRateValue +
                '}';
    }
}
