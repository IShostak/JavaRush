package com.javarush.task.task20.task2025;

import java.util.LinkedList;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371,
                407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725,
                4210818,  9800817, 9926315, 24678050, 24678051,  88593477,
                146511208, 472335975, 534494836, 912985153};
        List<Integer> list = new LinkedList<>();
        for (int number : numbers) {
            if (number < N) {
                list.add(number);
            }
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
                getNumbers(2147483647);
    }
}
