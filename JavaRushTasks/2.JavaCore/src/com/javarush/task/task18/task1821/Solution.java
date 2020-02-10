package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream buf = new BufferedInputStream(new FileInputStream(args[0]));

        TreeMap<Integer,Integer> mapi = new TreeMap<>();
        int i = 0;
        while (buf.available()>0) {
            if (mapi.containsKey(i = buf.read()))
                mapi.put(i,mapi.get(i)+1);
            else mapi.put(i,1);
        }

        for (Map.Entry<Integer,Integer> m :mapi.entrySet()) {
            System.out.println((char)m.getKey().byteValue() + " " + m.getValue() );
        }
        buf.close();
    }
}
