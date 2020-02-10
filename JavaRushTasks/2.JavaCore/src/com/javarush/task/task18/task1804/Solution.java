package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(buf.readLine());

        Map<Integer, Integer> mapi = new HashMap<>();

        while (file.available()>0){
            int bait = file.read();
            if (mapi.containsKey(bait))
                mapi.put(bait, mapi.get(bait) + 1);
            else mapi.put(bait,1);
        }
        int max = Integer.MAX_VALUE;
        ArrayList<Integer> ar = new ArrayList<>();

        for (Map.Entry<Integer, Integer> i: mapi.entrySet()) {

            if (i.getValue()<max) {
                max = i.getValue();
                ar.clear();
                ar.add(i.getKey());
            } else if (i.getValue()==max)
                ar.add(i.getKey());
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }

        file.close();
    }
}
