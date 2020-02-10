package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String file1 = buf.readLine();
        String file2 = buf.readLine();

        BufferedInputStream readFile1 = new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream readFile2 = new BufferedOutputStream(new FileOutputStream(file2));

        byte[] bait = new byte[readFile1.available()];
        readFile1.read(bait,0,bait.length);

        String s = new String(bait);
        String[] ss = s.split(" ");
        String res = "";

        for (String s1: ss) {
            Double d = Double.parseDouble(s1);
            res = res + Math.round(d) + " ";
        }

        readFile2.write(res.getBytes());

        readFile1.close();
        readFile2.close();
    }
}
