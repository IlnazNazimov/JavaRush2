package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String file1 = buf.readLine();
        String file2 = buf.readLine();
        String file3 = buf.readLine();

        BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(file1));
        BufferedOutputStream out2 = new BufferedOutputStream(new FileOutputStream(file1, true));
        BufferedInputStream read2 = new BufferedInputStream( new FileInputStream(file2));
        BufferedInputStream read3 = new BufferedInputStream( new FileInputStream(file3));

        while (read2.available()>0) {
            out1.write(read2.read());
        }

        while (read3.available()>0) {
            out2.write(read3.read());
        }

        out1.close();
        out2.close();
        read2.close();
        read3.close();
    }
}
