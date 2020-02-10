package com.javarush.task.task14.task1419;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> inte = new ArrayList<>(2);
            inte.get(500);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try
        {
            int[] ii = new int[5];
            ii[10] = 1;
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            Object[] obj = new String[2];
            obj[1] = new Integer(1);
        }
        catch(ArrayStoreException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            Object ch = 'r';
            System.out.println((Byte)ch);
        }
        catch(ClassCastException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            int[] i = new int[-5];
        }
        catch(NegativeArraySizeException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            int[] g = new int[5];
            g = null;
            int dd = g.length;
        }
        catch(NullPointerException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            String gdd = "dfg";
            gdd.charAt(8);

        }
        catch(StringIndexOutOfBoundsException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            int a = Integer.parseInt(null);
        }
        catch(NumberFormatException ex)
        {
            exceptions.add(ex);
        }

        try
        {
            File f = new File("D://java/file.txt");
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException ex)
        {
            exceptions.add(ex);
        }
    }
}
