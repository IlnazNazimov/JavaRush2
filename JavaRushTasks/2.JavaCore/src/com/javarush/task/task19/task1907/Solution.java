package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileReader reader = new FileReader(buf.readLine());
        Scanner scan = new Scanner(reader);
        int count = 0;
        char[] ch = new char[10000];

        reader.read(ch);
        String s = new String(ch);
        String[] ss = s.split("\\W");

        for (String si:ss) {
            if (si.equals("world") ||si.equals("World"))
                count++;
        }

        System.out.println(count);
        buf.close();
        reader.close();
        scan.close();
    }
}
