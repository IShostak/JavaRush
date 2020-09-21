package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int num1 =  (number - number%100)/100;
        int num3 = number%10;
        int num2 = (number -(number  - number%100) -num3)/10;
 //       System.out.println(num1 + " "+ num2 + " " + num3);

       return num1+num3 + num2;
    }
}