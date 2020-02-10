package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String mes;
        while (!(mes = buf.readLine()).equals("exit")){
            try {
                if (mes.contains("."))
                    print(Double.parseDouble(mes));
                else if (Integer.parseInt(mes) > 0 && Integer.parseInt(mes) < 128)
                    print(Short.parseShort(mes));
                else if (Integer.parseInt(mes) >= 128 || Integer.parseInt(mes) <= 0)
                    print(Integer.parseInt(mes));
            } catch (Exception e) {
                print(mes);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
