package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Имя1","Фамилия1");
        map.put("Имя2","Фамилия2");
        map.put("Имя3","Фамилия3");
        map.put("Имя4","Фамилия6");
        map.put("Имя5","Фамилия5");
        map.put("Имя6","Фамилия6");
        map.put("Имя7","Фамилия7");
        map.put("Имя8","Фамилия8");
        map.put("Имя9","Фамилия9");
        map.put("Имя10","Фамилия10");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count= 0;
        for (String key: map.values()) {
            if(key.equals(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count= 0;
        for (String key: map.keySet()) {
            if(key.equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
