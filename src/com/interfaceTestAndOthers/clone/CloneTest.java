package com.interfaceTestAndOthers.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public",50000);
        original.setHireDate(2000,1,1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDate(2002,12,31);
        System.out.println("Original: "+original);
        System.out.println("Copy: "+copy);
    }
}
