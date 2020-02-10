package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        boolean flag = true;

        while (flag){
            flag = false;

            String predInt = null;
            int predIndxInt = -1;
            String predString = null;
            int predIndString = -1;

            for (int j = 0; j < array.length - 1; j++) {
                if (isNumber(array[j])) {
                    predInt = array[j];
                    predIndxInt = j;
                    break;
                }
            }

            for (int j = 0; j < array.length - 1; j++) {
                if (!isNumber(array[j])) {
                    predString = array[j];
                    predIndString = j;
                    break;
                }
            }

            for (int j = 1; j < array.length; j++) {
                if (isNumber(array[j])) {
                    if (predInt != null) {
                        if (Integer.parseInt(predInt) < Integer.parseInt(array[j])) {
                            String p = array[j];
                            array[j] = predInt;
                            array[predIndxInt] = p;
                            predIndxInt = j;
                            flag = true;
                        }
                        else { predIndxInt = j; predInt = array[j]; }
                    }
                }
                else if (predString != null) {
                    if (isGreaterThan(predString,array[j])) {
                        String p = array[j];
                        array[j] = predString;
                        array[predIndString] = p;
                        predIndString = j;
                        flag=true;
                    }
                    else { predIndString= j; predString = array[j]; }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
