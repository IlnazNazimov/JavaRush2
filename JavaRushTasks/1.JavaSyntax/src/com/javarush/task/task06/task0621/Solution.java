package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat grandDad = new Cat(grandDadName);

        String grandMomName = reader.readLine();
        Cat grandMom = new Cat(grandMomName);

        String parenDadName = reader.readLine();
        Cat parenDad = new Cat(parenDadName, null, grandDad);

        String parenMomName = reader.readLine();
        Cat parenMom = new Cat(parenMomName, grandMom, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, parenMom, parenDad);

        String dochName = reader.readLine();
        Cat doch = new Cat(dochName, parenMom, parenDad);

        System.out.println(grandDad);
        System.out.println(grandMom);
        System.out.println(parenDad);
        System.out.println(parenMom);
        System.out.println(son);
        System.out.println(doch);
    }

    public static class Cat {
        private String name;
        private Cat parentMom;
        private Cat parentDad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMom, Cat parentDad) {
            this.name = name;
            this.parentDad = parentDad;
            this.parentMom = parentMom;
        }

        @Override
        public String toString() {
            if (parentDad == null && parentMom == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parentMom == null)
                return "The cat's name is " + name + ",  no mother, father is " + parentDad.name;
            else if (parentDad == null)
                return "The cat's name is " + name + ", mother is " + parentMom.name + ", no father";
            else return "The cat's name is " + name + ", mother is " + parentMom.name + ", father is " + parentDad.name;
        }
    }

}
