package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();

        FileInputStream f =new FileInputStream(fileName);
        load(f);
        f.close();

        FileOutputStream o = new FileOutputStream(fileName);
        save(o);
        o.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        p.putAll(properties);
        p.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);
        prop.forEach((a, b) -> properties.put((String) a, (String) b));
    }

    public static void main(String[] args) throws Exception {
     //   new Solution().fillInPropertiesMap();
    }
}
