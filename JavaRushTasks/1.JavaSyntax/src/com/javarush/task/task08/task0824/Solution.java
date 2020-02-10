package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human detka1 = new Human("детка", true, 8);
        Human detka2 = new Human("детка", false, 18);
        Human detka3 = new Human("детка", true, 12);
        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(detka1);
        childs.add(detka2);
        childs.add(detka3);
        Human rodichB = new Human("родичьП", true, 32, childs);
        Human rodichM = new Human("родичьM", false, 33, childs);
        ArrayList<Human> rodichBB = new ArrayList<>();
        ArrayList<Human> rodichMM = new ArrayList<>();
        rodichBB.add(rodichB);
        rodichMM.add(rodichM);
        Human deda = new Human("deda", false, 83, rodichBB);
        Human baba = new Human("baba", true, 88,rodichBB);
        Human deda2 = new Human("deda", false, 83, rodichMM);
        Human baba2 = new Human("baba", true, 88,rodichMM);
        ArrayList<Human> childs3 = new ArrayList<Human>();
        childs3.addAll(childs);
        childs3.addAll(rodichBB);
        childs3.addAll(rodichMM);
        childs3.add(deda);
        childs3.add(baba);
        childs3.add(deda2);
        childs3.add(baba2);

        for (Human h: childs3) {
            System.out.println(h.toString());
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
    public Human(String name, boolean sex, int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
