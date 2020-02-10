package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream bait = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(bait);
        System.setOut(stream);

        testString.printSomething();

        StringBuilder s = new StringBuilder(bait.toString());
        String res = s.toString().toUpperCase();
        System.setOut(consoleStream);
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
