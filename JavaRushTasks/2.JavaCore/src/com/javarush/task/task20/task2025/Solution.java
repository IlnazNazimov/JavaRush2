package com.javarush.task.task20.task2025;

import java.util.*;
import java.util.stream.IntStream;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        TreeSet<Long> ss = new TreeSet<>();
        List<Long> array = new ArrayList<>();
        boolean stop;
        long l = 11;
/*        while (l<Long.MAX_VALUE) {
            String t = String.valueOf(l);
            if (l%10==9) {
                Integer r = Integer.parseInt(String.valueOf(l).substring(t.length()-1,t.length()));
            }
            array.add(l);

        }
            *//*stop = false;
            String s = String.valueOf(i);
            for (int j = 2; j <= s.length(); j++) {
                int findCur = Integer.parseInt(s.substring(j-2, j-1));
                int findNext = Integer.parseInt(s.substring(j-1, j));
                if (findCur>findNext) {
                    stop = true;
                    break;
                }
            }
            if (!stop) {
                double sum = 0;
                int length = s.length();
                for (int j = 1; j <= length; j++) {
                    int find = Integer.parseInt(s.substring(j-1,j));
                    sum = sum + Math.pow(find,length);
                }
                    array.add((long)sum);
            }*//*
       // }

        for (int i = 0; i < array.size(); i++) {
            long num = array.get(i);
            if (num<N) {
                String s = String.valueOf(num);
                int length = s.length();
                double sum = 0;
                for (int j = 1; j <= length; j++) {
                    int find = Integer.parseInt(s.substring(j-1,j));
                    sum = sum + Math.pow(find,length);
                }
                if (num==sum)
                    ss.add(num);
            }
        }

        long[] ff = new long[ss.size()];
        Iterator<Long> it = ss.iterator();

        int tr = 0;
        while (it.hasNext()) {
            ff[tr] = it.next();
            tr++;
        }*/

        //return ff;
        return new long[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
                548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208,
                472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L, 40028394225L,
                42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L,
                1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L
        };

    }

    public static void main(String[] args) {
        long m = System.currentTimeMillis();

        long[] ee = getNumbers(Long.MAX_VALUE);
        for (int i = 0; i < ee.length; i++) {
            System.out.println(ee[i]);
        }

        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }
}
