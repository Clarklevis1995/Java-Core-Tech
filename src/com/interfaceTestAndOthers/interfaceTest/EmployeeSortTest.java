package com.interfaceTestAndOthers.interfaceTest;

import java.util.Arrays;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 16:58
 **/
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staffs = new Employee[3];
        staffs[0] = new Employee("Harry Hacker",35000);
        staffs[1] = new Employee("Carl Cracker", 75000);
        staffs[2] = new Employee("Tony Tester",38000);

        Arrays.sort(staffs);
        for (Employee e:staffs
             ) {
            System.out.println("name: "+e.getName()+" salary: "+e.getSalary());
        }

        Comparable<Employee> c = new Employee("a",120);
        System.out.println(staffs[0] instanceof Comparable);
    }
}
