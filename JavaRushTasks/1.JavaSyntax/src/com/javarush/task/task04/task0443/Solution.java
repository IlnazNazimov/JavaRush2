package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
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
        String s4 = buf.readLine();


        System.out.println("Меня зовут " + s1 + ".");
        System.out.println("Я родился " + s4 + "." + s3 +"." +s2);
    }
}
