package com.interfaceTestAndOthers.interfaceTest;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 16:55
 **/
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
