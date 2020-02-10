package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    public static FileOutputStream f;

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        f = name;
    }

    @Override
    public void flush() throws IOException {
        f.flush();
    }

    @Override
    public void write(int b) throws IOException {
        f.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        f.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        f.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        String s = "JavaRush © All rights reserved.";
        write(s.getBytes());
        f.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
