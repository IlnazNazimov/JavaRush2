package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(buf.readLine());
        }
        int i = vozr(list);
        if (i != 0)
            System.out.println(i);
    }

    public static int vozr(ArrayList<String> list){
        int i = 0;
        for (int j = 0; j < list.size(); j++) {

            if (i > list.get(j).length() )
                return j;
            i = list.get(j).length();
        }
        return 0;
    }
}

