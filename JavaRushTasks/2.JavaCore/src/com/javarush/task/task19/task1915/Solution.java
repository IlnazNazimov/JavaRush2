package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        read.close();

        FileOutputStream w = new FileOutputStream(fileName);

        ByteArrayOutputStream bait = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(bait);

        System.setOut(stream);
        testString.printSomething();

        w.write(bait.toByteArray());

        w.close();
        System.setOut(consoleStream);
        System.out.println(bait);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

