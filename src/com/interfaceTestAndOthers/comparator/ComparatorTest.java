package com.interfaceTestAndOthers.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] friends = {"Peter","Paul","MaryJane"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}
