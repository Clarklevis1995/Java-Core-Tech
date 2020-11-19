package com.object.method;

import java.awt.*;
import java.util.Random;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-14 16:02
 **/
public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee3[3];

        staff[0] = new Employee3("Harry",4000);
        staff[1] = new Employee3(5000);
        staff[2] = new Employee3();

        for (Employee3 e:staff
             ) {
            System.out.println("name = "+e.getName()+", id = "+e.getId()+", salary = "+e.getSalary());
        }
    }

}
 class Employee3{
     private static int nextId;

     private int id;
     private String name = ""; //instance field initialization

     private double salary;

     //static initialization block
     static{
         var generator = new Random();
         nextId = generator.nextInt(10000);
     }

     //object initialize block
     {
         id = nextId;
         nextId++;
     }

     //three overload constructors
     public Employee3(String name, double salary){
         this.name = name;
         this.salary = salary;
     }

     public Employee3(double salary){
         //call the Employee3(String , double) constructor
         this("Employee#"+nextId, salary);
     }

     public Employee3(){
         //default
     }

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public double getSalary() {
         return salary;
     }
 }