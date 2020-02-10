package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        //System.out.println(a.size());
        int min = Integer.MAX_VALUE;
        ArrayList<String> a2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (min > strings.get(i).length())
            {
                a2.clear();
                min = strings.get(i).length();
                a2.add(strings.get(i));
            }
            else if (min == strings.get(i).length())
                a2.add(strings.get(i));

        }
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }
    }
}
