package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class MonthlyRateEmployee extends Employee{

    private double monthlyRate;

    public MonthlyRateEmployee(String firstName, String lastName, String post, String department, double monthlyRate) {
        super(firstName, lastName, post, department);
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double getMonthSalary() {
        return monthlyRate;
    }
}
