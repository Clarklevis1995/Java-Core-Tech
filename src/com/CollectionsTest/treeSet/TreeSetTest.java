package com.CollectionsTest.treeSet;

import java.awt.*;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-27 16:40
 **/
public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        //默认顺序
        System.out.println(parts);

        var sortedByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortedByDescription.addAll(parts);
        //按照description排序
        System.out.println(sortedByDescription);
    }
}
