package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int m = Integer.parseInt(buf.readLine());

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            list.add(buf.readLine());
        }

        for (int i = 0; i < m; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
