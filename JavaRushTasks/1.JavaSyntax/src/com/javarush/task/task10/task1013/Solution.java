package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private String Fename;
        private int ss;
        public Human() {
        }

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age){
            this.name =name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex){
            this.name =name;
            this.age = age;
            this.sex = sex;
        }

        public Human(boolean sex){
            this.sex = sex;
        }

        public Human(int age){
            this.age = age;
        }

        public Human(int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int weight){
            this.name =name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(int age, boolean sex, int weight){
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, int weight){
            this.name =name;
            this.age = age;
            this.weight = weight;
        }
    }
}
