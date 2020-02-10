package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] a= new int[10];
        //String[] s = new String[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            a[i]= Integer.parseInt(buf.readLine());
            //a[i] = s[i].length();
            //System.out.println(a[9-i]);
        }
        for (int i = 0; i < 10; i++) {
            //a[i]= Integer.parseInt(buf.readLine());
            //a[i] = s[i].length();
            System.out.println(a[9 - i]);
        }
    }
}

