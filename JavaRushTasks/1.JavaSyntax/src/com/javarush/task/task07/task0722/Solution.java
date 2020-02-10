package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        while (true){
            String s  = buf.readLine();
            if (!s.equals("end"))
                list.add(s);
            else break;
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}