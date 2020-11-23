package com.interfaceTestAndOthers.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDate = new Date();
    }

    /*public Employee clone() throws CloneNotSupportedException{
        // call Object.clone();
        Employee cloned = (Employee) super.clone();

        //clone mutable field
        cloned.hireDate = (Date)hireDate.clone();

        return cloned;
    }*/

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        cloned.hireDate = (Date)hireDate.clone();
        return cloned;
    }

    public void setHireDate(int year, int month, int date){
        Date newHireDate = new GregorianCalendar(year, month - 1, date).getTime();
        hireDate.setTime(newHireDate.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
