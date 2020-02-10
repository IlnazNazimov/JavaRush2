package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(Integer.parseInt(buf.readLine()));
        }

        int count =1;
        int countMAx = 0;
        for (int i = 0; i < a.size()-1; i++) {
            if (a.get(i)== a.get(i+1))
                count++;
            else if (count> countMAx){
                countMAx = count;
                count =1;}
            else count =1;
        }
        if (count>countMAx)
            countMAx = count;
        System.out.println(countMAx);
    }
}