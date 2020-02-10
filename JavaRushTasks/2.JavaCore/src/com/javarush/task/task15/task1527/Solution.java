package com.javarush.task.task15.task1527;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;


/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String s = buf.readLine();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Character> charL = new ArrayList<>();
        char[] ch = s.toCharArray();
        boolean flag = false;
        String si = null;

        for (int j = 0; j < s.length() ; j++) {

            if (ch[j]=='?' || ch[j]=='&') {
                flag = true;
                if (charL.size()!=0) {
                    arr.add(charL.toString().substring(1, 3 * charL.size() - 1).replaceAll(", ", ""));
                    charL.clear();
                }
                continue;
            }
            else if (ch[j]=='=') {
                flag = false;
                arr.add(charL.toString().substring(1, 3 * charL.size() - 1).replaceAll(", ", ""));
                if (arr.get(0).equals("obj") && arr.size()==1) {
                    si = s.substring(j+1, s.indexOf('&'));
                }
                charL.clear();
                continue;
            }

            if (flag)
                charL.add(ch[j]);
        }
        for (String ss: arr) {
            System.out.print(ss +" ");
        }
        System.out.println("");
        if (si!=null) {
            try {
                alert(Double.parseDouble(si));
            } catch (Exception e) {
                alert(si);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
