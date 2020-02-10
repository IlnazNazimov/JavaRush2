package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));

        int x = Integer.parseInt(buf.readLine());
        int y = Integer.parseInt(buf.readLine());

        if(x <= 0 || y <= 0) throw new Exception();
        int max =0;
        int i = 1;

        while (i<=x && i<=y){
            if (x % i == 0 && y % i == 0)
                max = i;
            i++;
        }

        System.out.println(max);
    }
}
