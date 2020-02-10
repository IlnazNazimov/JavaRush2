package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> h = new ArrayList<Human>();
        h.add(new Human("Деда", true, 70));
        h.add(new Human("Деда", true, 70));
        h.add(new Human("Деда", true, 70));
        h.add(new Human("Деда", true, 70));
        h.add(new Human("Деда", true, 70, h.get(0), h.get(1)));
        h.add(new Human("Деда", true, 70, h.get(0), h.get(1)));
        h.add(new Human("Деда", true, 70, h.get(0), h.get(1)));
        h.add(new Human("Деда", true, 70, h.get(0), h.get(1)));
        h.add(new Human("Деда", true, 70, h.get(0), h.get(1)));

        for (Human hh: h) {
            System.out.println(hh.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}