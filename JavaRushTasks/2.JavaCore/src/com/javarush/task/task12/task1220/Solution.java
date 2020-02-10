package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Human implements CanRun, CanSwim{
        @Override
        public void eun() {

        }

        @Override
        public void swim() {

        }
    }

    public interface CanRun{
        void eun();
    }

    public interface CanSwim{
        void swim();
    }
}
