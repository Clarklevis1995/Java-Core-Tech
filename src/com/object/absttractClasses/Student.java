package com.object.absttractClasses;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-16 15:28
 **/
public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        //pass name to super constructor
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}
