package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();

        BufferedReader buff = new BufferedReader(new FileReader(fileName));

        String[] str;
        String line = "";
        StringBuilder result = new StringBuilder();
        while ((line = buff.readLine())!=null) {
            str = line.split(" ");
            for (int i = 0; i <str.length; i++) {
                try {
                    int j = Integer.parseInt(str[i]);
                    if (j>=0 & j<=12)
                        str[i] =map.get(j);
                } catch (Exception e) {

                }
                result.append(str[i]).append(" ");
            }
            result.append("\r\n");
        }
        System.out.println(result);
       // BufferedWriter buw = new BufferedWriter(new FileWriter(fileName));
       // buw.write(result.toString());
       // buw.close();
        buff.close();
    }
}
