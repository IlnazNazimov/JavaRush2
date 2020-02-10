package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public volatile static List<String> allLines = new ArrayList<String>();
    public volatile static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firtstName = reader.readLine();
        String secondName = reader.readLine();

        BufferedReader redeer1 = new BufferedReader( new FileReader(firtstName));
        BufferedReader redeer2 = new BufferedReader( new FileReader(secondName));
        String s = "";
        while ((s = redeer1.readLine())!=null) {
            allLines.add(s);
        }

        while ((s = redeer2.readLine())!=null) {
            forRemoveLines.add(s);
        }

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
