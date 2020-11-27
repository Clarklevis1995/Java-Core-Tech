package com.interfaceTestAndOthers.lambda;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 10:02
 **/
public class UesInterface {
    public static void main(String[] args) {
        repeat(10, i-> System.out.println("Countdown: "+(9-i)));
    }

    public static void repeat(int n, Intconsumer action){
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}
