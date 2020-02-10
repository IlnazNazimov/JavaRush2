package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        int count = file1.available();
        int[] bb = new int[count];

        for (int i = 0; i < count; i++) {
            bb[i] = file1.read();
        }

        for (int i = count -1; i >= 0; i--) {
            file2.write(bb[i]);
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
