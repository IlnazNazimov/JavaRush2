package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> mapi = new HashMap<>();

        mapi.put("January", 0);
        mapi.put("February", 1);
        mapi.put("March", 2);
        mapi.put("April", 3);
        mapi.put("May", 4);
        mapi.put("June", 5);
        mapi.put("July", 6);
        mapi.put("August", 7);
        mapi.put("September", 8);
        mapi.put("October", 9);
        mapi.put("November", 10);
        mapi.put("December", 11);

        String x = buf.readLine();
        int a = mapi.get(x);
        System.out.println(x + " is the " + (a+1) + " month");
    }
}
