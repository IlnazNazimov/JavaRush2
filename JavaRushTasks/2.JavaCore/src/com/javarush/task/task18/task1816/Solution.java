package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream(args[0]);
        //InputStream inp = new FileInputStream(fi);
        BufferedInputStream bif = new BufferedInputStream(fi);

        //BufferedReader reader = new BufferedReader(new InputStreamReader(fi));
        int count = 0;
        //String ch;
        while (bif.available()>0) {
            int bait = bif.read();
            if (bait>=65 && bait<=90 || bait>=97 && bait<=122)
                count++;
        }
        fi.close();
        bif.close();
        System.out.println(count);
    }
}
