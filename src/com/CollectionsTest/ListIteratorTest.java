package com.CollectionsTest;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-27 14:10
 **/
public class ListIteratorTest {
    public static void main(String[] args) {
        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        staff.add("Jenny");
        ListIterator<String> iterator = staff.listIterator(2);
        System.out.println(iterator.next().equals(staff.get(2)));//true


    }
}
