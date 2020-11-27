package com.interfaceTestAndOthers.InnerClass.双括号初始化;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 20:37
 **/
public class Test1 {
    public static void main(String[] args) {
        print(List.of("Jack","Tony","Harry"));
    }

    public static void print(List<String> list ){
        for (String e:list
             ) {
            System.out.println(e);
        }
    }
}
