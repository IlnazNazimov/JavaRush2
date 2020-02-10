package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        int sumchet = 0;
        int sumNechet = 0;
        for (int i = 0; i < 15; i++) {
            a[i] = Integer.parseInt(buf.readLine());
        }

        for (int i = 0; i < 15; i++) {
            if (i%2 == 0)
                sumchet+=a[i];
            else sumNechet+=a[i];
        }
        if (sumchet>sumNechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
