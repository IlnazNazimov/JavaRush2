package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedInputStream buf = new BufferedInputStream(new FileInputStream(args[0]));

        double allChars = buf.available();
        double countProbels = 0;

        while (buf.available()>0) {
            if ((char) buf.read() == ' ') countProbels++;
        }
        //BigDecimal d = new BigDecimal(2.3242342);
        buf.close();
        double result = countProbels/allChars*100;
        System.out.printf("%.2f", result);
    }
}
