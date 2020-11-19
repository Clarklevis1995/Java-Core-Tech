package com.object.absttractClasses;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-16 15:26
 **/
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
