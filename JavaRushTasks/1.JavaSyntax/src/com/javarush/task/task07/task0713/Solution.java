package com.javarush.task.task07.task0713;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> boss = new ArrayList<>();
        ArrayList<Integer> del3 = new ArrayList<>();
        ArrayList<Integer> del2 = new ArrayList<>();
        ArrayList<Integer> del = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            boss.add(Integer.parseInt(buf.readLine()));
        }
        for (int i = 0; i < boss.size(); i++) {
            int g = boss.get(i);
            if (g % 3 ==0)
                del3.add(g);
            if (g % 2 ==0)
                del2.add(g);
            if (g % 3 != 0 && g % 2 != 0)
                del.add(g);
        }
        printList(del3);
        printList(del2);
        printList(del);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
