package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String ss = args[0] +" ";
        String s = buf.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(s));

        while ((s = reader.readLine())!=null) {
            if (s.substring(0,ss.length()).equals(ss))
                System.out.println(s);
        }

        buf.close();
        reader.close();
    }
}
