package com.object.method;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        System.out.println(new Date());

        LocalDate newYearsEve = LocalDate.of(1999,12,31);
        System.out.println(newYearsEve.getYear()+"年 "+newYearsEve.getMonthValue()+"月 "+newYearsEve.getDayOfMonth()+"日");

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        System.out.println("After 1000 days:");
        System.out.println(aThousandDaysLater.getYear()+"年 "+aThousandDaysLater.getMonthValue()+"月 "+aThousandDaysLater.getDayOfMonth()+"日");
        calendar();
    }

    public static void calendar(){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);//将日期设定为这个月的第一天
        DayOfWeek weekDay = date.getDayOfWeek();//得到当前日期的星期几
        int value = weekDay.getValue();//星期一到星期日

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            }
            else System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }


    }
}
