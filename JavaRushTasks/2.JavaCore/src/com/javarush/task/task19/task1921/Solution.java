package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        //BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        Pattern pattern = Pattern.compile("(([а-яА-Яa-zA-Z]+[\\s-]+)+)([\\d+\\s+]+)");
        String line = "";
        String name = "";
        DateFormat d = new SimpleDateFormat("d M yyyy");
        Date date;

        while ((line = buf.readLine())!=null) {
            Matcher m = pattern.matcher(line);
            while (m.find()) {
                name = m.group(1).trim();
                date = d.parse(m.group(3));
                PEOPLE.add(new Person(name,date));
                //System.out.println(name + " " + date);
            }
        }
        buf.close();
    }
}
