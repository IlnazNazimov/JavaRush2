package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(buf.readLine());

        Map<Integer, Integer> mapi = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while (file.available()>0){
            int bait = file.read();
            //if(!arr.contains(bait))
                arr.add(bait);
        }

        //Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        file.close();
    }
}
