package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Character> gl = new ArrayList<>();
        ArrayList<Character> sogl = new ArrayList<>();

        String str = buf.readLine();
        char[] rr = str.toCharArray();
        for (char r: rr) {
            if (isVowel(r))
                gl.add(r);
            else  if (r!=' ')sogl.add(r);
        }
        for (char c: gl) {
            System.out.print(c+ " ");
        }
        System.out.println();

        for (char c: sogl) {
            System.out.print(c+ " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}