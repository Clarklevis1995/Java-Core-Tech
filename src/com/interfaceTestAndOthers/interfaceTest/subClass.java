package com.interfaceTestAndOthers.interfaceTest;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 21:08
 **/
public class subClass implements Interface_A, Interface_B{
    public static void main(String[] args) {
        subClass subClass = new subClass();
        subClass.method(12);
    }

    @Override
    public void method(int a) {
        
    }
}
