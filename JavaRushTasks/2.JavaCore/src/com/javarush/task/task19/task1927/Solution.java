package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream old = System.out;
        String text = "JavaRush - курсы Java онлайн";

        ByteArrayOutputStream b =new ByteArrayOutputStream();
        PrintStream s =new PrintStream(b);
        System.setOut(s);

        testString.printSomething();
        String [] g = b.toString().split("\\n");
        System.setOut(old);
        int i = 1;
        for (int j = 0; j < g.length; j++) {
            System.out.println(g[j]);
            if  ((i % 2) == 0) { // если строка третья, то выводим в консоль рекламу
                System.out.println("JavaRush - курсы Java онлайн");
            }
            i++; // считаем счетчик второй строки
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
