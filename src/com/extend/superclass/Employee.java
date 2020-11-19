package com.extend.superclass;

import java.time.LocalDate;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-15 11:48
 **/
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int date) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, date);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    public Employee getBuddy(){
        return this;
    }
}
