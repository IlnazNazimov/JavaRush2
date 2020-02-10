package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String readFile = buf.readLine();
        String writeFile = buf.readLine();
        buf.close();

        FileReader read = new FileReader(readFile);
        BufferedReader reader = new BufferedReader(read);

        StringBuilder full = new StringBuilder();

        while (reader.ready()) {
            char ch = (char)reader.read();
            if (ch=='.')
                full.append('!');
            else full.append(ch);
        }

        reader.close();
        read.close();

        FileWriter wr = new FileWriter(writeFile);
        BufferedWriter writer = new BufferedWriter(wr);

        writer.write(full.toString());
        writer.close();
        wr.close();
    }
}
