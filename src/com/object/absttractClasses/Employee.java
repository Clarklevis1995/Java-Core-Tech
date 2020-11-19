package com.object.absttractClasses;

import java.time.LocalDate;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-16 15:29
 **/
public class Employee extends Person {
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int date) {
        super(name);
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, date);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
