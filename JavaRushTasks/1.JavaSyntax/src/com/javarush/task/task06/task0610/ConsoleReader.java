package com.javarush.task.task06.task0610;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        return buf.readLine();

    }

    public static int readInt() throws Exception {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        return Integer.parseInt(buf.readLine());

    }

    public static double readDouble() throws Exception {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        return Double.parseDouble(buf.readLine());

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        return Boolean.parseBoolean(buf.readLine());

    }

    public static void main(String[] args) throws Exception {

    }
}
