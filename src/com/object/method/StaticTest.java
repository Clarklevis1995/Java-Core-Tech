package com.object.method;

public class StaticTest {
    public static void main(String[] args) {
        var staff = new Employee1[3];
        staff[0] = new Employee1("Tom",40000);
        staff[1] = new Employee1("Dick",20000);
        staff[2] = new Employee1("Harry",30000);

        for (Employee1 e:staff
             ) {
            e.setId();
            System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());

            int n = Employee1.getNextId();
            System.out.println("Next available id = "+n);
        }

    }
}

class Employee1{
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        var e = new Employee1("Harry", 50000);
        System.out.println(e.getName()+"  "+e.getSalary());
    }
}
