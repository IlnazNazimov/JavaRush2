package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int max = 0;
        int indMax =0;
        int indMin = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            strings.add(buf.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            int x = strings.get(i).length();
            if (max < x)
            {
                max = x;
                indMax = i;
            }
            if (min> x)
            {
                min = x;
                indMin = i;
            }
        }
        System.out.println(indMax<indMin ? strings.get(indMax) : strings.get(indMin));

    }
}
