package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

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

        for (Map.Entry<String,Double> mm : m.entrySet()) {
            System.out.println(mm.getKey() + " " + mm.getValue());
        }
    }
}
