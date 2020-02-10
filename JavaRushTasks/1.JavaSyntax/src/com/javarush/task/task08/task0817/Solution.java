package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {

    public static Map<String, String> createMap() {
        Map<String,String> mapi = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            mapi.put("Фамилия" +i, "Имя" + i);
        }
        mapi.put("Фамилия22", "Имя2");
       // print(mapi);
        return mapi;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String,String>> ff = map.entrySet().iterator();
        int count = 0;
        ArrayList<String> s = new ArrayList<>();
        while (ff.hasNext()){
            Map.Entry<String,String> f = ff.next();

            for (Map.Entry<String,String> tt:map.entrySet()) {
                if (tt.getValue().equals(f.getValue()))
                    count++;
            }
             if (count>1)s.add(f.getValue());
             count = 0;
        }
        for (String a: s) {
            removeItemFromMapByValue(map,a);
        }
       // print(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

/*    public static void print(Map<String,String> mapi){
        for (Map.Entry<String,String> ma: mapi.entrySet())
        {
            System.out.println(ma.getKey()+ " - " + ma.getValue());

        }
        System.out.println();
    }*/

    public static void main(String[] args) {
       // removeTheFirstNameDuplicates(createMap());
    }
}
