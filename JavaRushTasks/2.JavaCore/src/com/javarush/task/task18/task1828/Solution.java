package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length!=0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String s;
            ArrayList<String> str = new ArrayList<>();

            String id = add(8,args[1]);

            if (args[0].equals("-u") || args[0].equals("-d")) {
                while ((s = reader1.readLine()) != null) {
                    int currentID = Integer.parseInt(s.substring(0, 8).trim());
                    if (currentID == Integer.parseInt(args[1])) {
                        if (args[0].equals("-u")) {
                            String productName = add(30, args[2]);
                            String price = add(8, args[3]);
                            String quantity = add(4, args[4]);
                            str.add(id + productName + price + quantity);
                        }
                    } else str.add(s);
                }
            }

            BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

            for (String si:str) {
                buff.write(si);
                buff.newLine();
            }

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
