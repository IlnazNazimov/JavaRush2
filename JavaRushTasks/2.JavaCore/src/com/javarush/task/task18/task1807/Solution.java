package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file = new FileInputStream(buf.readLine());
        int count = 0;
        while (file.available()>0){
            if (file.read()==44)
                count++;
        }
        file.close();
        buf.close();

        System.out.println(count);
    }
}
