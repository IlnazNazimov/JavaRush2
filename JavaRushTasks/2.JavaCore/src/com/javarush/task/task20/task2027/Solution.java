package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        for (Word w:detectAllWords(crossword, "home", "same", "opres")) {
            System.out.println(w);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> li = new ArrayList<>();
        for (String s :words) {
            Word w = new Word(s);
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[0].length; j++) {
                    if (crossword[i][j] == s.charAt(0) ) {
                        if (w.endY==-1 && j<crossword[0].length-1 && crossword[i][j+1]==s.charAt(1))
                            test(i,j,0,1, w, crossword);
                        if (w.endY== -1 && j<crossword[0].length-1 && i<crossword.length-1 && crossword[i+1][j+1]==s.charAt(1))
                            test(i,j,1,1, w, crossword);
                        if (w.endY== -1 &&   i<crossword.length-1 && crossword[i+1][j]==s.charAt(1))
                            test(i,j,1,0, w, crossword);
                        if (w.endY==-1 &&   i<crossword.length-1 && j!=0 && crossword[i+1][j-1]==s.charAt(1))
                            test(i,j,1,-1, w, crossword);
                        if (w.endY==-1 &&   j!=0 && crossword[i][j-1]==s.charAt(1))
                            test(i,j,0,-1, w, crossword);
                        if (w.endY==-1 &&   j!=0 && i!=0 && crossword[i-1][j-1]==s.charAt(1))
                            test(i,j,-1,-1, w, crossword);
                        if (w.endY==-1 &&   i!=0 && crossword[i-1][j]==s.charAt(1))
                            test(i,j,-1,0, w, crossword);
                        if (w.endY==-1 &&   j<crossword[0].length-1 && i!=0 && crossword[i-1][j+1]==s.charAt(1))
                            test(i,j,-1,1, w, crossword);
                    }
                }
            }
            if (w.endY!=-1) li.add(w);
        }
        return li;
    }

    public static void test(int i, int j, int a, int b, Word w, int[][] cross) {
        w.setStartPoint(j,i);
        for (int k = 1; k < w.text.length(); k++) {
            i = i + a;
            j = j + b;
            if (i<0 || j<0 || i>=cross.length || j>=cross[0].length || !(cross[i][j] == w.text.charAt(k)))
                return;
        }
        w.setEndPoint(j,i);
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
            endX=-1;
            endY=-1;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
