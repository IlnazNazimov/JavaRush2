package com.javarush.task.task08.task0827;

import javafx.scene.input.DataFormat;
import sun.util.calendar.BaseCalendar;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.MAY;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("May 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        //DataFormat datee = new DataFormat(date);
        Date t = new Date(date);
        Date tt = new Date(t.getYear(),Calendar.JANUARY,1 );
        //int x = 76896/864;
        long a = t.getTime()- tt.getTime();

        long yy = 1000*60*60*24;

        long f =  a/yy +1;
        System.out.println("f:" + f);

        if (f % 2 !=0)
            return true;
        else return false;
/*        System.out.println("t:" + t);
        System.out.println("tt:" + tt);
        System.out.println("x:" + x);
        System.out.println("a:" + a);
        System.out.println("yy:" + yy);*/
        //return true;
    }
}
