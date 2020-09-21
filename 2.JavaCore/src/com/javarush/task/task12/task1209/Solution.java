package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(min(5,1));
    }

    public static int min(int n, int m){
        return m < n ? m : n;
    }
    public static long min(long n, long m){
        return m < n ? m : n;
    }
    public static double min(double n, double m){
        return m < n ? m : n;
    }
}
