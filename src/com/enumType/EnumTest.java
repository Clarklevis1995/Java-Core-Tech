package com.enumType;

import org.w3c.dom.ls.LSOutput;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-18 15:30
 **/
public class EnumTest {
    public static void main(String[] args) {

        //打印枚举常量的值
        System.out.println(Size.SMALL.toString());

        //将枚举类型的引用设置为和字符串同名的类型
        Size s = Enum.valueOf(Size.class,"SMALL");
        System.out.println(s);

        //得到一个包含全部枚举值的数组
        Size[] values = Size.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //返回枚举常量在枚举类型中的位置
        System.out.println(Size.EXTRA_LARGE.ordinal());
    }

}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
