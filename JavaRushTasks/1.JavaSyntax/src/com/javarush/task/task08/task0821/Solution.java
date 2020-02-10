package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> mapi = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            mapi.put("Фамилия"+i,"Имя" +i);
        }
        mapi.put("Фамилия5","Имя999");
        mapi.put("Фамилия999","Имя6");

        return mapi;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
