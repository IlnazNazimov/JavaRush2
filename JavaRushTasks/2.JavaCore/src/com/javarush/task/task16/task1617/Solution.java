package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (numSeconds>0){
                try {
                    Thread.sleep(1000);

                    if (numSeconds!=1) {
                        System.out.print(numSeconds + " ");
                    } else  System.out.print(numSeconds + " Марш!");
                    numSeconds--;

                } catch (InterruptedException e) {
                   // e.printStackTrace();
                    System.out.print(numSeconds + " Прервано!");
                    return;
                }

            }
        }
    }
}
