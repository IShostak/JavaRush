package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }
    public class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public class Thread2 extends Thread   {
        boolean isIter;
        @Override
        public void run() {
            while (!isIter){
                isIter = true;
            }

        }
    }
}