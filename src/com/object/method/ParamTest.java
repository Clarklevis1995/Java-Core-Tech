package com.object.method;

public class  ParamTest {
    public static void main(String[] args) {

        //test1 方法不能改变基本数据类型的值
        System.out.println("testing triple value:");
        double percent = 10;
        System.out.println("Before: percent = "+percent);

        tripleValue(percent);

        System.out.println("After: percent = "+percent);

        //test2 方法可以改变对象的参数
        System.out.println("\nTesting triple salary");
        var harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary = "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = "+harry.getSalary());

        //test3 方法不能让一个对象的引用指向另一个对象
        System.out.println("\nTesting swap");
        var a = new Employee2("Alice", 70000);
        var b = new Employee2("Bob", 80000);
        System.out.println("Before: a = "+a.getName());
        System.out.println("Before: b = "+b.getName());

        swap(a,b);
        System.out.println("After: a = "+a.getName());
        System.out.println("After: b = "+b.getName());


    }

    public static void tripleValue(double x){
        x = 3* x;
        System.out.println("End of the method: x = "+x);
    }

    public static void tripleSalary(Employee2 e){
        e.raiseSalary(200);
        System.out.println("End of the method: Salary = "+e.getSalary());
    }

    public static void swap(Employee2 e1, Employee2 e2){
        Employee2 temp = e1;
        e1 = e2;
        e2 = temp;

        System.out.println("End of the method: e1 = "+e1.getName());
        System.out.println("End of the method: e2 = "+e2.getName());

    }


}

class Employee2{
    private String name;
    private double salary;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }
}
