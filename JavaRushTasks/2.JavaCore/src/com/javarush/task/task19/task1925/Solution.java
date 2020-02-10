package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String firstfileName = args[0];
        String secondfileName = args[1];

        BufferedReader buff = new BufferedReader(new FileReader(firstfileName));

        String[] str;
        String line = "";
        StringBuilder result = new StringBuilder();

        while ((line = buff.readLine())!=null) {
            str = line.split(" ");
            for (int i = 0; i <str.length; i++) {
                if (str[i].length()>6)
                    result.append(str[i]).append(",");
            }
        }

        result.deleteCharAt(result.length()-1);
        BufferedWriter buw = new BufferedWriter(new FileWriter(secondfileName));
        buw.write(result.toString());
        buw.close();
        buff.close();
    }
}
