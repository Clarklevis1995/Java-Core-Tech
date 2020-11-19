package com.object.method;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        var employee = new Employee("James",5000,LocalDate.of(2002,12,21));
        var employee1 = new Employee(null,5000,LocalDate.of(2002,12,21));
        var employee2 = new Employee(null,5000,null);
        System.out.println(employee2.getHireDate());
    }


}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = Objects.requireNonNull(hireDate,"unknown");
        Objects.requireNonNull(name,"The name cannot be null");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
