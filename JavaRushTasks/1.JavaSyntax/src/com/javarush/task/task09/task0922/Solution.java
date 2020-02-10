package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat date2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String d = buf.readLine();
        Date date1 = date.parse(d);
        //Date datee = new Date(date.format(buf.readLine()));
        System.out.println(date2.format(date1).toUpperCase());
        //Date date2 = buf.read();
    }
}
