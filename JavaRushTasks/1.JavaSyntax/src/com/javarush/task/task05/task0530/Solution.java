package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        String bb = reader.readLine();

        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
