package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat = new Cat("Vaska", 3, 5, 7);
        Cat cat2 = new Cat("Vaska2", 4, 2, 6);
        Cat cat3 = new Cat("Vaska3", 8, 1, 2);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}