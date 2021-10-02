package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class PercentOfSalesPayedEmployee extends Employee {
    private Double salesAmountPerMonth;
    private Integer salaryPercent;

    @Override
    public double getMonthSalary() {
        return salesAmountPerMonth * salaryPercent / 100;
    }

    public void setSalesAmountPerMonth(Double salesAmountPerMonth) {
        this.salesAmountPerMonth = salesAmountPerMonth;
    }

    public void setSalaryPercent(Integer salaryPercent) {
        this.salaryPercent = salaryPercent;
    }

    @Override
    public String toString() {
        return "PercentOfSalesPayedEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", post='" + getPost() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salesAmountPerMonth=" + salesAmountPerMonth +
                ", salaryPercent=" + salaryPercent +
                '}';
    }
}
