package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int MyCAt =0;
        int  Cat2 = 0;

        if (this.age> anotherCat.age)
            MyCAt++;
        else if (this.age< anotherCat.age) Cat2++;

        if (this.weight> anotherCat.weight)
            MyCAt++;
        else if (this.weight< anotherCat.weight) Cat2++;

        if (this.strength> anotherCat.strength)
            MyCAt++;
        else if (this.strength< anotherCat.strength) Cat2++;

        if (MyCAt>Cat2)
            return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
