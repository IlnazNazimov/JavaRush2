package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    public int top;
    public int left;
    public int width;
    public int height;

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left, int height, int width){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle(int top){
        this.top = top;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public static void main(String[] args) {

    }
}
