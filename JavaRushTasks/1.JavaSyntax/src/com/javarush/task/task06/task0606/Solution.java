package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        String s = buf.readLine();


        for (int i = 0; i < s.length(); i++) {
            int a = Integer.parseInt(s.substring(i,i+1));
            //System.out.println(s.substring(i,i+1));
            if (a%2==0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
