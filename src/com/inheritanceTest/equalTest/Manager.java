package com.inheritanceTest.equalTest;

import java.util.Objects;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int date) {
        super(name, salary, year, month, date);
        bonus = 0;

    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "bonus=" + bonus +
                '}';
    }
}
