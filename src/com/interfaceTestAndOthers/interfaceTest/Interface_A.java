package com.interfaceTestAndOthers.interfaceTest;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 21:05
 **/
public interface Interface_A {
    default void method(int a){
        System.out.println("This is interface A");
    }
}
