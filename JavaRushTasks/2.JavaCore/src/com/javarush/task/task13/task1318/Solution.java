package com.javarush.task.task13.task1318;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String gg = "C:\\Users\\Ильназ\\Desktop\\Книга для проганья.txt";
        String fileName = buf.readLine();

        FileInputStream in= new FileInputStream(fileName);

        while (in.available() > 0){
            System.out.print(Character.toChars(in.read()));
        }

        in.close();
        buf.close();
    }
}