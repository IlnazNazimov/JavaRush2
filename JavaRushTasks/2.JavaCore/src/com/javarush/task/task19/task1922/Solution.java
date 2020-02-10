package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();

        BufferedReader bu = new BufferedReader( new FileReader(fileName));
        String allStr = "";

        for (String str:words) {
            if (allStr.equals(""))
                allStr = allStr.concat(str);
            else allStr = allStr.concat("\\b|" + str + "\\b");
        }

        Pattern p = Pattern.compile(allStr);
        String line;
        int i;
        while ((line = bu.readLine())!=null) {
            i = 0;
            Matcher m = p.matcher(line);
            while (m.find()) {
                i++;
            }
            if (i==2) {
                System.out.println(line);
            }
        }
        bu.close();
    }
}
