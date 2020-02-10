package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mapi = new HashMap<>();

        while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                int id = Integer.parseInt(s);

                String name = reader.readLine();
                if (name.isEmpty()) {
                    mapi.put("", id);
                }
                else mapi.put(name, id);
        }

        for (Map.Entry<String, Integer> m: mapi.entrySet()) {
            System.out.println(m.getValue() + " " +m.getKey());
            //System.out.println(m.getKey());
        }
    }
}
