package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> mapi = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            mapi.put("Имя" +i, 100*i);
        }
        return  mapi;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Integer> mapp = iter.next();
            if (mapp.getValue()<500)
                iter.remove();
        }
    }

    public static void main(String[] args) {

    }
}