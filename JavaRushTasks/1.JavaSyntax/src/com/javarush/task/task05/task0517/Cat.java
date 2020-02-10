package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name){
        this.name = name;
        color = "black";
        age = 3;
        weight=5;
    }
    public Cat(String name,int weight,int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "black";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat( int weight, String color){
        this.color = color;
        this.weight = weight;
        age = 3;
    }
    public Cat(int weight, String color,  String address){
        this.color = color;
        this.weight = weight;
        this.address = address;
        age = 3;
    }
    public static void main(String[] args) {

    }
}
