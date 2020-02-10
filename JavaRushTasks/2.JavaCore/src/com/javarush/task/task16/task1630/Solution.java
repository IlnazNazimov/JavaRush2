package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e){

        }
    }

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, FileNotFoundException {
        //ReadFileInterface f = new ReadFileThread();
        ReadFileThread f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface{

        void setFileName(String fullFileName);

        String getFileContent() throws FileNotFoundException, InterruptedException;

        //void join() throws InterruptedException;

        //void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String FileName = "";
        private String FileContent = "";
        private String Line;

        @Override
        public void setFileName(String fullFileName) {
            this.FileName = fullFileName;
        }

        @Override
        public String getFileContent() throws FileNotFoundException, InterruptedException {
            return FileContent;
        }

/*        @Override
        public void join() throws InterruptedException {
            Thread.currentThread().join();
        }*/

/*        @Override
        public void start() {
            new Thread(this).start();
        }*/

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader( new FileReader(this.FileName));
                while ((this.Line = reader.readLine()) != null) {
                    this.FileContent = this.FileContent + " " + this.Line;
                }
                this. FileContent = this.FileContent.trim();
                reader.close();
                this.interrupt();
            } catch (IOException e){

            }
        }
    }
}
