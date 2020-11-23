package com.interfaceTestAndOthers.lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = {1,2,2,3,5,2,2,4,6,7};
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        //实际上这里参数是一个Predict对象，并实现了里面的test方法
        list.removeIf(e->e==2);
        System.out.println(list);


    }
}
