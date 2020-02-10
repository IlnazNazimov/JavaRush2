package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> mapi = new HashMap<>();
        List<String> list = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            mapi.put(city,name);
            //list.add(family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String find = reader.readLine();
        //if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = mapi.get(find);
            System.out.println(familyName);
        //}
    }
}
