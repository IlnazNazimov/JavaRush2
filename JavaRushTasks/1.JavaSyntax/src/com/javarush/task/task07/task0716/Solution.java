package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ListIterator<String> s = strings.listIterator();
        while (s.hasNext()){
            String nextString = s.next();

            if (nextString.contains("р") && !nextString.contains("л"))
                s.remove();
            if (!nextString.contains("р") && nextString.contains("л"))
                s.add(nextString);
        }
        return strings;
    }
}