package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream concoleStream = System.out;

        ByteArrayOutputStream bait = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(bait);

        System.setOut(stream);

        testString.printSomething();

        //String t = String.format("a [+|-|*] b = c");

        StringBuilder s = new StringBuilder(bait.toString());
        String res = s.toString().replaceAll("\r\n","");

        Pattern pattern = Pattern.compile("^(\\d+)\\s*([+\\-*])\\s*(\\d+)\\s*=");
        Matcher m = pattern.matcher(s);

        int first = 0;
        String znak = "";
        int second = 0;
        int result = 0;

        while (m.find()) {
            first = Integer.parseInt(m.group(1));
            znak = m.group(2);
            second = Integer.parseInt(m.group(3));
        }

        switch (znak) {
            case ("+"): {
                result = first + second;
                break;
            }
            case ("-"): {
                result = first - second;
                break;
            }
            case ("*"): {
                result = first * second;
            }
        }

        System.setOut(concoleStream);
        System.out.println(res + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

