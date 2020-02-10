package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileReader reader = new FileReader(buf.readLine());
       // FileReader reader2 = new FileReader(buf.readLine());
        FileWriter wr =new FileWriter(buf.readLine());
        int i =1;
        while (reader.ready()) {
            int read =reader.read();
            if (i % 2 ==0)
                wr.write(read);
            i++;
        }
        buf.close();
        reader.close();
        wr.close();
    }
}
