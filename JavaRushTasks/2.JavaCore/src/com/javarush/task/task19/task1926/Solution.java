package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();
        BufferedReader b = new BufferedReader(new FileReader(fileName));

        String line = "";

        while ((line = b.readLine())!=null) {
            StringBuilder s = new StringBuilder();
            s.append(line);
            s.reverse();
            System.out.println(s.toString());
        }
        b.close();
    }
}
