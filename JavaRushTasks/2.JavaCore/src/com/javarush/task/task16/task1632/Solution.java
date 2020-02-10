package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Nit1());
        threads.add(new Nit2());
        threads.add(new Nit3());
        threads.add(new Nit4());
        threads.add(new Nit5());
    }

    public static void main(String[] args) {

    }

    public static class Nit1 extends Thread{

        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Nit2 extends Thread{

        @Override
        public void run() {
            try {

                    Thread.sleep(333);
                    //Thread.currentThread().interrupt();

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Nit3 extends Thread{

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
               // e.printStackTrace();
            }
        }
    }

    public static class Nit4 extends Thread implements Message{

        @Override
        public void run() {
            while (true){

            }
        }

        @Override
        public void showWarning() {
            if (this.isAlive())
                this.stop();
        }
    }

    public static class Nit5 extends Thread{

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            String s = "";
            int sum = 0;
            try {
                while (!(s = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (IOException e){

            }
        }
    }
}