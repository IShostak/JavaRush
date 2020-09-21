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
            int time =1;
            while (numSeconds >0){
                System.out.print(numSeconds-- +" ");


                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                }
                if(time > 3.5){
                    System.out.println("Прервано!");
                    this.interrupt();
                    return;
                }
                time++;
            }
            System.out.print("Марш!");

        }
    }
}
