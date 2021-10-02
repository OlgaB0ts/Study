package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class MonthlyRatePlusPercentPayedEmployee extends Employee {
    private Double baseMonthlyRateValue;
    private Double amountOfSalesPerMonth;
    private Integer salaryPercent;

    @Override
    public double getMonthSalary() {
        return baseMonthlyRateValue + amountOfSalesPerMonth * salaryPercent / 100;
    }

    public void setBaseMonthlyRateValue(Double baseMonthlyRateValue) {
        this.baseMonthlyRateValue = baseMonthlyRateValue;
    }

    public void setAmountOfSalesPerMonth(Double amountOfSalesPerMonth) {
        this.amountOfSalesPerMonth = amountOfSalesPerMonth;
    }

    public void setSalaryPercent(Integer salaryPercent) {
        this.salaryPercent = salaryPercent;
    }

    @Override
    public String toString() {
        return "MonthlyRatePlusPercentPayedEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", post='" + getPost() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", baseMonthlyRateValue=" + baseMonthlyRateValue +
                ", amountOfSalesPerMonth=" + amountOfSalesPerMonth +
                ", salaryPercent=" + salaryPercent +
                '}';
    }
}
