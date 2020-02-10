package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        ArrayList<Integer> a = new ArrayList<>(array);

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> a = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(buf.readLine()));
        }
        return a;
    }
}
