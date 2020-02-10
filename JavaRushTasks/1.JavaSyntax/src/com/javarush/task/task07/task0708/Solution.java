package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        //System.out.println(a.size());
        int max = 0;
        ArrayList<String> a2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (max < strings.get(i).length())
            {
                a2.clear();
                max = strings.get(i).length();
                a2.add(strings.get(i));
            }
            else if (max == strings.get(i).length())
                a2.add(strings.get(i));

        }
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }
    }
}
