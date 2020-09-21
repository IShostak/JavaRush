package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        while(num > 10){
            if (num %2 ==0) even++;
            else odd++;
            num = (num - num%10)/10;
        }
        if(num < 10)
        {
            if (num %2 ==0) even++;
            else odd++;
        }
        System.out.printf("Even: %s Odd: %s", even,odd);

    }
}
