package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class HourlyPayedEmployee extends Employee {

    private int numberOfWorkHoursPerMonth;
    private double pricePerHour;

    public HourlyPayedEmployee(String firstName, String lastName, String post, String department, double pricePerHour) {
        super(firstName, lastName, post, department);
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double getMonthSalary() {
        return pricePerHour * numberOfWorkHoursPerMonth;
    }

    public void setNumberOfWorkHoursPerMonth(int numberOfWorkHoursPerMonth) {
        this.numberOfWorkHoursPerMonth = numberOfWorkHoursPerMonth;
    }
}
