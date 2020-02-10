package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] list = new int[20];

        for (int i = 0; i < 20; i++) {
            list[i] =Integer.parseInt(buf.readLine());
        }

        for (int i = 0; i < 20; i++) {
            if (max < list[i])
                max = list[i];
            if (min > list[i])
                min = list[i];
        }
        System.out.print(max + " " + min);
    }
}
