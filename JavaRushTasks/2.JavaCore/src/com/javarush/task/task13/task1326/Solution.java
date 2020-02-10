package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String name = buf.readLine();
        FileInputStream f = new FileInputStream(name);
        BufferedReader but = new BufferedReader( new InputStreamReader(f));
        ArrayList<Integer> arr = new ArrayList<>();

        while (but.ready()){
            int ii = Integer.parseInt(but.readLine());
            if(ii % 2 == 0)
                arr.add(ii);
        }

        Collections.sort(arr);

        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }

        f.close();

    }
}
