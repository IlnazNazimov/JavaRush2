package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String shifr = args[0];
        String fileName = args[1];
        String newFile = args[2];

        FileInputStream in = new FileInputStream(fileName);
        byte[] bait = new byte[in.available()];
        in.read(bait);

        if (shifr.equals("-d")) {
            for (int i = 0; i < bait.length; i++) {
                bait[i] = (byte)((int)bait[i]- 1);
            }
        } else {
            for (int i = 0; i < bait.length; i++) {
                bait[i] = (byte)((int)bait[i]+ 1);
            }
        }

        FileOutputStream fi = new FileOutputStream(newFile);
        fi.write(bait);
        in.close();
        fi.close();
    }

}
