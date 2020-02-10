package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        int sum =0;
        while (true)
        {
            String s1= buf.readLine();
            int a = Integer.parseInt(s1);
            if (a==-1) {
                sum += a;
                System.out.println(sum);
                break;
            }
            sum +=a;
        }
    }
}
