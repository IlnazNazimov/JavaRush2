package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String readFileName = buf.readLine();
        String writeFileName = buf.readLine();
        buf.close();

        FileReader reader = new FileReader(readFileName);
        BufferedReader re = new BufferedReader( reader);

        FileWriter wr = new FileWriter(writeFileName);
        BufferedWriter bw = new BufferedWriter(wr);

        char[] ch = new char[100];
        re.read(ch);
        re.close();
        reader.close();

        String s = new String(ch).trim();
/*        Pattern p = new Pattern("1");*/
        String[] si = s.split("\\s");
        for (String s1:si) {
            try {
                String str = String.valueOf(Integer.parseInt(s1));
                bw.write(str + " ");
            } catch (NumberFormatException ex) {

            }
        }
        bw.close();
        wr.close();
    }
}
