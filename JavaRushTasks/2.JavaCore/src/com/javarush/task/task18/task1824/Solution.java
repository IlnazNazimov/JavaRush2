package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        ArrayList<BufferedInputStream> ar = new ArrayList<>();

        while (true) {
            try {
                s = buf.readLine();
                BufferedInputStream by = new BufferedInputStream(new FileInputStream(s));
                ar.add(by);
            } catch (FileNotFoundException ex) {
                System.out.println(s);
                for (BufferedInputStream f :ar) {
                    f.close();
                }
                break;
            }
        }


    }
}
