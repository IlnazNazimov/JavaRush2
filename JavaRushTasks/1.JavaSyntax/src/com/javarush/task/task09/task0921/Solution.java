package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<>();
        try {
            while (true) {
                int a = Integer.parseInt(buf.readLine());
                ar.add(a);
            }
        }
        catch (Exception e){
            for (int g:ar) {
                System.out.println(g);
            }
        }

    }
}
