package com.interfaceTestAndOthers.interfaceTest;

import org.w3c.dom.ls.LSOutput;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 21:06
 **/
public interface Interface_B {
    //默认实现方法
    default void method(int a){
        System.out.println("Hello");
    }
}
