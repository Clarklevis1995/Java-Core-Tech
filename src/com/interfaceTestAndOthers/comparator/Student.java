package com.interfaceTestAndOthers.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-30 11:07
 **/
public class Student {
    public String name;
    public int ID;
    public int grade;

    public Student(String name, int ID, int grade) {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "[name: "+name+", ID: "+ID+", grade: "+grade+"]";
    }

    public static void main(String[] args) {
        PriorityQueue<Student> list = new PriorityQueue<>(new IDAscendComparator());
        list.add(new Student("John",2,34));
        list.add(new Student("Jenny",1,56));
        list.add(new Student("Bob",3,100));

        for (Student s:list
             ) {
            System.out.println(s);
        }


    }
}

class IDAscendComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.ID - o2.ID;
    }
}


