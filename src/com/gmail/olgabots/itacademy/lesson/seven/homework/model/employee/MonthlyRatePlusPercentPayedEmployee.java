package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class MonthlyRatePlusPercentPayedEmployee extends Employee {
    private double baseMonthlyRate;
    private double salesAmountPerMonth;
    private int salaryPercent;

    public MonthlyRatePlusPercentPayedEmployee(String firstName, String lastName, String post, String department, double baseMonthlyRate, int salaryPercent) {
        super(firstName, lastName, post, department);
        this.baseMonthlyRate = baseMonthlyRate;
        this.salaryPercent = salaryPercent;
    }

    @Override
    public double getMonthSalary() {
        return baseMonthlyRate + salesAmountPerMonth * (salaryPercent / 100);
    }

    public void setSalesAmountPerMonth(double salesAmountPerMonth) {
        this.salesAmountPerMonth = salesAmountPerMonth;
    }
}
