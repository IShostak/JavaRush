package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        String res ="";
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                for (int i = 0; i < 3; i++) {
                    res+=reader.readLine() + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            res.substring(0,res.length()-1);
        }
        public void printResult(){
            System.out.println(res);
        }
    }

}
