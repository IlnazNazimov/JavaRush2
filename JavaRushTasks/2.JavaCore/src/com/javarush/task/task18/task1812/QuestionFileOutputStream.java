package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream{
    AmigoOutputStream a;
    public QuestionFileOutputStream(AmigoOutputStream am){
        this.a = am;
    }

    @Override
    public void flush() throws IOException {
        a.flush();
    }

    @Override
    public void write(int b) throws IOException {
        a.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        a.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        a.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(i);
        String s = reader.readLine();
        if (s.equals("Д")) {
            a.close();
        }
    }

}

