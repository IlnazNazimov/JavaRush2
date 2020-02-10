package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            a.add(" " +i);
        }
        System.out.println(a.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(a.get(i));
        }
    }
}
