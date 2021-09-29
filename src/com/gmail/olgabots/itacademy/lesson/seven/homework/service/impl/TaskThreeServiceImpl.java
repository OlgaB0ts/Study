package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.employee.*;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskThreeService;

public class TaskThreeServiceImpl implements TaskThreeService {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        HourlyPayedEmployee hourlyPayedEmployeeFirst = new HourlyPayedEmployee("Polina", "Bor", "programmer", "development",20);
        hourlyPayedEmployeeFirst.setNumberOfWorkHoursPerMonth(7);
        employees[0] = hourlyPayedEmployeeFirst;

        HourlyPayedEmployee hourlyPayedEmployeeSecond = new HourlyPayedEmployee("Sasha", "Tobby", "accountant", "bookkeeping",30);
        hourlyPayedEmployeeSecond.setNumberOfWorkHoursPerMonth(40);
        employees[1] = hourlyPayedEmployeeSecond;

        employees[2] = new MonthlyRateEmployee("Tom", "Trast", "Director", "Administration", 15000);
        employees[3] = new MonthlyRateEmployee("Jack", "Snow", "Janitor", "Cleaning service", 500);
        employees[4] = new MonthlyRateEmployee("Jack", "Snow", "Janitor", "Cleaning service", 500);

        PercentOfSalesPayedEmployee percentOfSalesPayedEmployeeFirst = new PercentOfSalesPayedEmployee("Ray", "Kreep", "manager", "auto", 15);
        percentOfSalesPayedEmployeeFirst.setSalesAmountPerMonth(70000);
        employees[5] = percentOfSalesPayedEmployeeFirst;

        PercentOfSalesPayedEmployee percentOfSalesPayedEmployeeSecond = new PercentOfSalesPayedEmployee("Lyc", "Star", "assistant", "auto", 2);
        percentOfSalesPayedEmployeeSecond.setSalesAmountPerMonth(7800);
        employees[6] = percentOfSalesPayedEmployeeSecond;

        PercentOfSalesPayedEmployee percentOfSalesPayedEmployeeThird = new PercentOfSalesPayedEmployee("Tim", "Brace", "assistant", "clothes", 3);
        percentOfSalesPayedEmployeeThird.setSalesAmountPerMonth(9000);
        employees[7] = percentOfSalesPayedEmployeeThird;

        MonthlyRatePlusPercentPayedEmployee monthlyRatePlusPercentPayedEmployeeFirst = new MonthlyRatePlusPercentPayedEmployee("Mike", "Berg", "engineer", "cellphone", 500, 10);
        monthlyRatePlusPercentPayedEmployeeFirst.setSalesAmountPerMonth(79000);
        employees[8] = monthlyRatePlusPercentPayedEmployeeFirst;

        MonthlyRatePlusPercentPayedEmployee monthlyRatePlusPercentPayedEmployeeSecond = new MonthlyRatePlusPercentPayedEmployee("Ammi", "Berg", "engineer", "cellphone", 600, 15);
        monthlyRatePlusPercentPayedEmployeeSecond.setSalesAmountPerMonth(2000);
        employees[9] = monthlyRatePlusPercentPayedEmployeeSecond;

        for (Employee employee : employees) {
            System.out.println(employee.getInfo());
        }
    }
}
