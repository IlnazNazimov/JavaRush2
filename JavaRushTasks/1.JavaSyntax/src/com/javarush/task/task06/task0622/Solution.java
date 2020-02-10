package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> aa = new ArrayList<Integer>();
        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(reader.readLine());
            aa.add(a);
        }
        while (flag) {
            flag = false;
            for (int i = 0; i < 4; i++) {
                if (aa.get(i) > aa.get(i + 1)) {
                    int h = aa.get(i);
                    aa.set(i, aa.get(i + 1));
                    aa.set(i + 1, h);
                    flag = true;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(aa.get(i));
        }
    }
}
