package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
      for(int i=0; i< 5;i++) {
          System.out.println(sum + 1 + i);
          sum += i+1;
      }
    }
}
