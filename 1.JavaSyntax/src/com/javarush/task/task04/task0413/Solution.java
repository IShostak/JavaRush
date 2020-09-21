package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        reader.close();
        String dayy= "";
        switch (day) {
            case 1:
                dayy = "понедельник";
                break;
            case 2:
                dayy = "вторник";
                break;
            case 3:
                dayy = "среда";
                break;
            case 4:
                dayy = "четверг";
                break;
            case 5:
                dayy = "пятница";
                break;
            case 6:
                dayy = "суббота";
                break;
            case 7:
                dayy = "воскресенье";
                break;

                default:
                    dayy = "такого дня недели не существует";
                    break;
        }
        System.out.println(dayy);
    }
}