package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1 = new FileInputStream(buf.readLine());

        FileOutputStream file2 = new FileOutputStream(buf.readLine());
        FileOutputStream file3 = new FileOutputStream(buf.readLine());

        int count = file1.available();
        while (file1.available()>count/2){
            file2.write(file1.read());
        }
        while (file1.available()>0)
        {
            file3.write(file1.read());
        }
        file1.close();
        file2.close();
        file3.close();
        buf.close();
    }
}
