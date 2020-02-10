package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));

        String s1 = buf.readLine();
        String s2 = buf.readLine();
        String s3 = buf.readLine();

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        int a3 = Integer.parseInt(s3);

        if (a1<a2 && a1>a3 || a1>a2 && a1<a3 || a1==a2 || a1 ==a3)
            System.out.println(a1);
        else if (a2<a1 && a2>a3 || a2>a1 && a2<a3 || a2==a1 || a2==a3)
            System.out.println(a2);
        else if (a3<a2 && a3>a1 || a3>a2 && a3<a1 || a3==a2 || a3 ==a1)
            System.out.println(a3);

    }
}
