package com.extend.superclass;

import java.time.LocalDate;
import java.util.EnumMap;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-15 11:51
 **/
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int date) {
        super(name, salary, year, month, date);
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public Manager getBuddy() {
        return this;
    }
}
