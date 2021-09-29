package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class PercentOfSalesPayedEmployee extends Employee{
    private double salesAmountPerMonth;
    private int salaryPercent;

    public PercentOfSalesPayedEmployee(String firstName, String lastName, String post, String department, int salaryPercent) {
        super(firstName, lastName, post, department);
        this.salaryPercent = salaryPercent;
    }

    @Override
    public double getMonthSalary() {
        return salesAmountPerMonth *(salaryPercent /100D);
    }

    public void setSalesAmountPerMonth(double salesAmountPerMonth) {
        this.salesAmountPerMonth = salesAmountPerMonth;
    }
}
