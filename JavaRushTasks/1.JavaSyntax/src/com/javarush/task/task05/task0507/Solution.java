package com.javarush.task.task05.task0507;

import sun.util.BuddhistCalendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        int sum =0;
        int count =0;
        while (true) {
            String s = buf.readLine();
            int a = Integer.parseInt(s);
            if (a == -1) {
                double x = (double) sum / count;
                System.out.println(x);
                break;
            } else {
                count++;
                sum += a;
            }
        }
    }
}

