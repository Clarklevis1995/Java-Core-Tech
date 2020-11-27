package com.interfaceTestAndOthers.StaticInnerClass;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-26 12:24
 **/
public class ArrayAlg {
    /*
    公共静态类 Pair
     */
    public static class Pair{
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double d:values
             ) {
            if (d > max){
                max = d;
            }
            if (d < min){
                min = d;
            }
        }
        return new Pair(min, max);
    }
}
