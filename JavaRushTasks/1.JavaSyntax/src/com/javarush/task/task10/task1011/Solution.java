package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        int len = s.length() -7;
        for (int i = 0; i < len; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }

}

