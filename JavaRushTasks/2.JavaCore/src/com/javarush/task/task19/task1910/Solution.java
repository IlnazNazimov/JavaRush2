package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String readFile = buf.readLine();
        String writeFile = buf.readLine();
        buf.close();

        FileReader read = new FileReader(readFile);
        BufferedReader reader = new BufferedReader(read);
        String fill = "";
        while (reader.ready()) {
            fill = fill + reader.readLine().replaceAll("\\p{Punct}","");
        }
//        StringBuilder full = new StringBuilder();

/*        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher("ddd, dsf=- . fdfd!");
        String fu = m.replaceAll("");*/

        reader.close();
        read.close();

        FileWriter wr = new FileWriter(writeFile);
        BufferedWriter writer = new BufferedWriter(wr);

        writer.write(fill);
        writer.close();
        wr.close();
    }
}
