package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String s = "";
        Double d = 0d;
        TreeMap<String,Double> m = new TreeMap<>();
        String ss = "";
        while ((ss = buf.readLine())!=null) {
            s = ss.split(" ")[0];
            d = Double.parseDouble(ss.split(" ")[1]);
            if (m.containsKey(s))
                m.put(s,m.get(s)+d);
            else m.put(s,d);
        }
        buf.close();

        double dd = Collections.max(m.values());
        TreeSet<String> hs = new TreeSet<>();
        for (Map.Entry<String, Double> mm : m.entrySet()) {
            if (mm.getValue() == dd)
                hs.add(mm.getKey());
        }

        for (String f : hs) {
            System.out.println(f);
        }
    }
}
