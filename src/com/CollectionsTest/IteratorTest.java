package com.CollectionsTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-27 11:12
 **/
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Iterator<String> iterator = list.iterator();
        iterator.next();
        iterator.remove();//删除成功
        System.out.println(list);
        //[B, C, D, E, F]
    }
}

