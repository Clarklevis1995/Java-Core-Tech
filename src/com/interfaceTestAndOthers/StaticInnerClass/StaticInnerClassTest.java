package com.interfaceTestAndOthers.StaticInnerClass;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-26 12:28
 **/
public class StaticInnerClassTest {
    public static void main(String[] args) {
        var value = new double[20];
        for (int i = 0; i < value.length; i++) {
            value[i] = 100 * Math.random();
        }
        ArrayAlg.Pair pair = ArrayAlg.minmax(value);
        System.out.println("min = "+pair.getFirst());
        System.out.println("max = "+pair.getSecond());
    }
}
