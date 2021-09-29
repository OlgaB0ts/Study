package com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee;

public abstract class Employee implements Payable {
    protected String firstName;
    protected String lastName;
    protected String post;
    protected String department;

    public Employee(String firstName, String lastName, String post, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
        this.department = department;
    }

    public String getInfo() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", post='" + post + '\'' +
                ", department='" + department + '\'' +
                ", monthly salary=" + getMonthSalary() +
                '}';
    }
}
