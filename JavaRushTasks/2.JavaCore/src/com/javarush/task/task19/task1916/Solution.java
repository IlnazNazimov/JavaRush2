package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = buf.readLine();
        String secondFileName = buf.readLine();
        buf.close();

        BufferedReader buf1 = new BufferedReader(new FileReader(firstFileName));
        BufferedReader buf2 = new BufferedReader(new FileReader(secondFileName));

        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();

        ar1.addAll(buf1.lines().collect(Collectors.toList()));
        ar2.addAll(buf2.lines().collect(Collectors.toList()));

        do {
            if (ar1.get(0).equals(ar2.get(0))) {
                lines.add(new LineItem(Type.SAME, ar1.get(0)));
                ar1.remove(0);
                ar2.remove(0);
            }
            else if (ar1.size()>=2 && ar1.get(1).equals(ar2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, ar1.get(0)));
                ar1.remove(0);
            } else {
                lines.add(new LineItem(Type.ADDED, ar2.get(0)));
                ar2.remove(0);
            }
        } while (ar1.size()!=0 & ar2.size()!=0);

        if (ar1.size()==0 & ar2.size()!=0)
            lines.add(new LineItem(Type.ADDED, ar2.get(0)));
        else if (ar1.size()!=0)
            lines.add(new LineItem(Type.REMOVED, ar1.get(0)));

        buf1.close();
        buf2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
