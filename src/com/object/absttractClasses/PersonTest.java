package com.object.absttractClasses;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-16 15:26
 **/
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000,1990, 12, 15);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p: people
             ) {
            System.out.println(p.getDescription());
        }
    }
}
