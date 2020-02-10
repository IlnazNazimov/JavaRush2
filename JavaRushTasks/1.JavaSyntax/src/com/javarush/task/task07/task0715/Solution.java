package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        Collections.addAll(str, "мама", "мыла", "раму");
        for (int i = -1; i < 5; i+=2) {
            str.add(i+2, "именно");
        }
        for (String x: str)
        {
            System.out.println(x);
        }
    }
}
