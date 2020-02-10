package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String file1 = buf.readLine();
        String file2 = buf.readLine();

        BufferedInputStream readFile1 = new BufferedInputStream(new FileInputStream(file1));
        BufferedInputStream readFile2 = new BufferedInputStream(new FileInputStream(file2));


        byte[] bait = new byte[readFile1.available()];
        readFile1.read(bait,0,bait.length);

        byte[] bait2 = new byte[readFile2.available()];
        readFile2.read(bait2,0,bait2.length);

        //здесь мы ихобъеденили
        BufferedOutputStream writeFile1 = new BufferedOutputStream(new FileOutputStream(file1));

        writeFile1.write(bait2);
        writeFile1.write(bait);

        readFile1.close();
        readFile2.close();
        writeFile1.close();
    }
}
