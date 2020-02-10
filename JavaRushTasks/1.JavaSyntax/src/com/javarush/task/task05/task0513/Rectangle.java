package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    public int top;
    public int left;
    public int width;
    public int height;

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left, int height, int width){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize(int top){
        this.top = top;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }

//    public void initialize(int top, int left, int width){
//        this.top = top;
//        this.left = left;
//        this.width = width;
//    }
    public static void main(String[] args) {

    }
}
