package com.javarush.task.task13.task1319;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();

        BufferedWriter buw = new BufferedWriter(new FileWriter(fileName));
        ArrayList<String> ss = new ArrayList<>();

        while (true){
            String a = buf.readLine();
            if (a.equals("exit")) {
                ss.add(a);
                break;
            }
            ss.add(a);
        }

        for (int i = 0; i < ss.size(); i++) {
            buw.write(ss.get(i));
            buw.newLine();
        }

        buw.close();
        buf.close();
    }
}
