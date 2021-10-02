package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee.*;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskService;

public class TaskThreeServiceImpl implements TaskService {

    @Override
    public void runTask() {

        Employee[] employees = createEmployees();

        printEmployeeInfo(employees);
    }

    private void printEmployeeInfo(Employee[] employees) {
        for (Employee employee : employees) {
            String employeeInfo = employee + "\n" +
                    "Month salary is " + employee.getMonthSalary() + "\n";

            System.out.println(employeeInfo);
        }
    }

    private Employee[] createEmployees() {
        HourlyPayedEmployee firstEmployee = new HourlyPayedEmployee();
        firstEmployee.setFirstName("Polina");
        firstEmployee.setLastName("Bor");
        firstEmployee.setPost("programmer");
        firstEmployee.setDepartment("development");
        firstEmployee.setPricePerHour(20.0);
        firstEmployee.setNumberOfWorkHoursPerMonth(7);

        HourlyPayedEmployee secondEmployee = new HourlyPayedEmployee();
        secondEmployee.setFirstName("Sasha");
        secondEmployee.setLastName("Smith");
        secondEmployee.setPost("accountant");
        secondEmployee.setDepartment("bookkeeping");
        secondEmployee.setPricePerHour(30.0);
        secondEmployee.setNumberOfWorkHoursPerMonth(40);


        MonthlyRateEmployee thirdEmployee = new MonthlyRateEmployee();
        thirdEmployee.setFirstName("Tom");
        thirdEmployee.setLastName("Trust");
        thirdEmployee.setDepartment("Administration");
        thirdEmployee.setPost("Director");
        thirdEmployee.setMonthlyRateValue(15000.0);

        MonthlyRateEmployee fourthEmployee = new MonthlyRateEmployee();
        fourthEmployee.setFirstName("Jack");
        fourthEmployee.setLastName("Snow");
        fourthEmployee.setPost("Janitor");
        fourthEmployee.setDepartment("Cleaning service");
        fourthEmployee.setMonthlyRateValue(500.0);

        MonthlyRateEmployee fifthEmployee = new MonthlyRateEmployee();
        fifthEmployee.setFirstName("Lia");
        fifthEmployee.setLastName("Snow");
        fifthEmployee.setPost("Janitor");
        fifthEmployee.setDepartment("Cleaning service");
        fifthEmployee.setMonthlyRateValue(550.0);

        PercentOfSalesPayedEmployee sixthEmployee = new PercentOfSalesPayedEmployee();
        sixthEmployee.setFirstName("Ray");
        sixthEmployee.setLastName("Smith");
        sixthEmployee.setPost("manager");
        sixthEmployee.setDepartment("auto");
        sixthEmployee.setSalaryPercent(15);
        sixthEmployee.setSalesAmountPerMonth(70000.0);

        PercentOfSalesPayedEmployee seventhEmployee = new PercentOfSalesPayedEmployee();
        seventhEmployee.setFirstName("Lyc");
        seventhEmployee.setLastName("Star");
        seventhEmployee.setPost("assistant");
        seventhEmployee.setDepartment("auto");
        seventhEmployee.setSalaryPercent(2);
        seventhEmployee.setSalesAmountPerMonth(7800.0);

        PercentOfSalesPayedEmployee eighthEmployee = new PercentOfSalesPayedEmployee();
        eighthEmployee.setFirstName("Tim");
        eighthEmployee.setLastName("Brace");
        eighthEmployee.setPost("assistant");
        eighthEmployee.setDepartment("clothes");
        eighthEmployee.setSalaryPercent(3);
        eighthEmployee.setSalesAmountPerMonth(1000.0);

        MonthlyRatePlusPercentPayedEmployee ninthEmployee = new MonthlyRatePlusPercentPayedEmployee();
        ninthEmployee.setFirstName("Mike");
        ninthEmployee.setLastName("Berg");
        ninthEmployee.setPost("engineer");
        ninthEmployee.setDepartment("cellphone");
        ninthEmployee.setBaseMonthlyRateValue(5000.0);
        ninthEmployee.setSalaryPercent(10);
        ninthEmployee.setAmountOfSalesPerMonth(9800.0);

        MonthlyRatePlusPercentPayedEmployee tenthEmployee = new MonthlyRatePlusPercentPayedEmployee();
        tenthEmployee.setFirstName("Anni");
        tenthEmployee.setLastName("Berg");
        tenthEmployee.setPost("engineer");
        tenthEmployee.setDepartment("cellphone");
        tenthEmployee.setBaseMonthlyRateValue(2000.0);
        tenthEmployee.setSalaryPercent(15);
        tenthEmployee.setAmountOfSalesPerMonth(10000.0);

        Employee[] employees = {firstEmployee,
                secondEmployee, thirdEmployee, fourthEmployee,
                fifthEmployee, sixthEmployee, seventhEmployee,
                eighthEmployee, ninthEmployee, tenthEmployee};
        return employees;
    }

    @Override
    public String toString() {
        String info = "Task three\n\n" +
                "1. Develop a program for the formation of a payroll at the enterprise.\n" +
                "2. Provide 4 types of employees, depending on the payroll option:\n" +
                "       -monthly rate\n" +
                "       -hourly payment\n" +
                "       -% of sales\n" +
                "       -base monthly rate +% of sales\n" +
                "3. For each employee, store the name, surname, position information (name, department)\n" +
                "4. Create an array of 10 employees\n" +
                "5. Display information about the employee and the money earned for the month\n";
        return info;
    }
}
