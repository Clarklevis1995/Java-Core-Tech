package com.interfaceTestAndOthers.InnerClass;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 16:01
 **/
public class StaticInnerClassTest {
    public static void main(String[] args) {
        var values = new double[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = Math.random()*100;
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(values);
        System.out.println("min = "+p.getFirst());
        System.out.println("max = "+p.getSecond());
    }
}
