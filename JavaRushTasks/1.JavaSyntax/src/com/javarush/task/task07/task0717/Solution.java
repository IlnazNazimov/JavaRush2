package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(buf.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String string : result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ListIterator<String> iterStr = list.listIterator();

        while (iterStr.hasNext()) {
            String s = iterStr.next();
            iterStr.add(s);
        }
        return list;
    }
}
