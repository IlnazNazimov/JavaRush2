package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/*
Проход по дереву файлов
*/
public class Solution {


    public static void main(String[] args) throws IOException {
        ArrayList<File> treeSet = new ArrayList<>();
        File f = new File(args[1]);
        File ff = new File(f.getParent() + "/allFilesContent.txt");
        File direct = new File(args[0]);
        FileUtils.renameFile(f, ff);

        BufferedWriter buf = new BufferedWriter(new FileWriter(ff));

        ChecDir(direct, treeSet);
        treeSet.sort(Comparator.comparing(File::getName));

        for (File s : treeSet) {
            String h = "";
            BufferedReader bufer = new BufferedReader(new FileReader(s));
            while ((h = bufer.readLine())!=null) {
                buf.write(h);
            }
            buf.newLine();
        }
        buf.close();
    }

    public static void ChecDir(File file, ArrayList tr) {

        for (File fileIn : file.listFiles()) {
            if (fileIn.isDirectory())
                ChecDir(fileIn, tr);
            else {
                if (fileIn.length() <= 50 ) {
                    tr.add(fileIn);
                }
            }
        }
    }
}
