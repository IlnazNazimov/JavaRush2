package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = "";
            strings.add(0,strings.get(4));
            strings.remove(5);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
