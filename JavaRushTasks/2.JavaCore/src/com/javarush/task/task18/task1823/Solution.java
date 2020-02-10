package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        while (!(s = buf.readLine()).equals("exit")) {
            ReadThread rt = new ReadThread(s);
            rt.start();
        }
        buf.close();
    }

    public static class ReadThread extends Thread {
        String fileName = "";
        public ReadThread(String fileName) {
            this.fileName =fileName;
        }

        @Override
        public void run() {
            try {
                ReadFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void ReadFile() throws IOException {
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileName));
            Map<Integer,Integer> mapi = new HashMap<>();
            int ii;

            while (reader.available()>0) {
                if (mapi.containsKey((ii = reader.read())))
                    mapi.put(ii,mapi.get(ii)+1);
                else mapi.put(ii,1);
            }

            int max = 0;
            int bait = 0;

            for (Map.Entry<Integer,Integer> m: mapi.entrySet()) {
                if (m.getValue()> max) {
                    max = m.getValue();
                    bait = m.getKey();
                }
            }
            resultMap.put(fileName, bait);
            reader.close();
        }

    }
}
