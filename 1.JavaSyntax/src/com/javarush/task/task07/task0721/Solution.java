package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        maximum = Integer.parseInt(reader.readLine());
        minimum = Integer.parseInt(reader.readLine());
        int[] mas = new int[20];
        mas[0] = maximum;
        mas[1] = minimum;
        for (int i = 2; i < 20; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] > maximum) maximum = mas[i];
            if(mas[i] < minimum) minimum = mas[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
