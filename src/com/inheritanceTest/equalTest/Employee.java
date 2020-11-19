package com.inheritanceTest.equalTest;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null) return false;
        if (getClass()!=o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 &&
                Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getHireDate(), employee.getHireDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getHireDate());
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary = salary+raise;
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
