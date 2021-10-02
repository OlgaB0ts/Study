package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public class HourlyPayedEmployee extends Employee {

    private Integer numberOfWorkHoursPerMonth;
    private Double pricePerHour;

    @Override
    public double getMonthSalary() {
        return pricePerHour * numberOfWorkHoursPerMonth;
    }

    public void setNumberOfWorkHoursPerMonth(Integer numberOfWorkHoursPerMonth) {
        this.numberOfWorkHoursPerMonth = numberOfWorkHoursPerMonth;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return "HourlyPayedEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", post='" + getPost() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", numberOfWorkHoursPerMonth=" + numberOfWorkHoursPerMonth +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
