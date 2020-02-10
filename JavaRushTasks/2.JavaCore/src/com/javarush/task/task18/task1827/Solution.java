package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length!=0) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        char[] productName = add(30,args[1]).toCharArray();
        char[] price = add(8,args[2]).toCharArray();
        char[] quantity = add(4,args[3]).toCharArray();


            BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String s;
            int max = 0;

            while ((s = reader1.readLine())!=null) {
                int current = Integer.parseInt(s.substring(0,8).trim());
                if (current>max)
                    max = current;
            }

            char[] id = add(8,String.valueOf(max+1)).toCharArray();
            //BufferedWriter buff = new BufferedWriter(new FileWriter(fileName,true));
           // FileOutputStream buff = new FileOutputStream(fileName,true);
            BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)));

            buff.newLine();
            buff.write(id);
            buff.write(productName);
            buff.write(price);
            buff.write(quantity);

            reader1.close();
            buff.close();
        }
    }

    public static String add(int length, String str) {
        while (str.length()<length) {
            str = str.concat(" ");
        }
        return str;
    }
}
