package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] aa = string.toCharArray();
        ArrayList<String> ff = new ArrayList<>();
        ff.add(String.valueOf(Character.toUpperCase(aa[0])));

        for (int i = 1; i < aa.length; i++) {
            if(aa[i-1]==' ' && aa[i]!= ' ')
                ff.add(String.valueOf(Character.toUpperCase(aa[i])));
            else ff.add(String.valueOf(aa[i]));

        }

        for (int i = 0; i < ff.size(); i++) {
            System.out.print(ff.get(i));
        }
    }
}
