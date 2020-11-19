package com.extend.superclass;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-15 11:53
 **/
public class ManagerTest {
    public static void main(String[] args) {
        //construct a manager object
        var boss = new Manager("Carl Cracker", 80000,1987, 12, 15);
        boss.setBonus(5000);
        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tommy Tester",40000,1990,12,1);

        for (Employee e:staff
             ) {
            System.out.println(e);
        }

    }


}
