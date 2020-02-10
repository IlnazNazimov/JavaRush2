package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(buf.readLine());
        int maxbait = 0;
        while (file.available()>0){
            int bait = file.read();
            if (bait>maxbait)
                maxbait = bait;
        }
        file.close();
        System.out.println(maxbait);
    }
}
