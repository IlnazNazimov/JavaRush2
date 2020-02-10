package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();
        String teg = args[0];

        BufferedReader ff = new BufferedReader(new FileReader(fileName));
        String s = ff.lines().collect(Collectors.joining());

        Document document = Jsoup.parse(s,"", Parser.xmlParser());
        Elements elem = document.select(args[0]);

        for (Element e :elem) {
            System.out.println(e);
        }
        ff.close();
    }
}
