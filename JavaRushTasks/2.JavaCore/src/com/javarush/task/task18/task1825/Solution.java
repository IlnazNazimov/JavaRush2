package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.zip.InflaterInputStream;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        TreeSet<String> myset = new TreeSet<>();
        TreeMap<Integer,byte[]> mapi = new TreeMap<>();
        String path = "";
        String[] ss = new String[0];

        while (!(s = buf.readLine()).equals("end"))
            myset.add(s);

        String finalfile = myset.first().split("\\.part")[0];
        FileOutputStream buff = new FileOutputStream(finalfile);

        for (String si:myset) {
            FileInputStream fff = new FileInputStream(si);
            byte[] bait = new byte[fff.available()];
            fff.read(bait);
            buff.write(bait);
            fff.close();
        }
        buff.close();
        /*{
            File file = new File(s);
            path = file.getPath();
            BufferedInputStream reader = new BufferedInputStream(fff);

            reader.read(bait);

            ss = path.split("\\.part");
            mapi.put(Integer.parseInt(ss[1]), bait);
            fff.close();
            reader.close();
        }
        buf.close();
        //BufferedOutputStream buff = new BufferedOutputStream( new FileOutputStream(finalfile));

        for (Map.Entry<Integer, byte[]> m: mapi.entrySet()) {
            buff.write(m.getValue());
        }

        buff.close();*/
    }
}
