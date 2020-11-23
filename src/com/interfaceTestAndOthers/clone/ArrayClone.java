package com.interfaceTestAndOthers.clone;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] copy = nums.clone();
        copy[0] = 2;

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(copy));
        //[1, 2, 3, 4, 5]
        //[2, 2, 3, 4, 5]
    }
}
