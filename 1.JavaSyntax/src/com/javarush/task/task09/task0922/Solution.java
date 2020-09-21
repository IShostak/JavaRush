package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date = format.parse(scanner.nextLine());
        scanner.close();
        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(format1.format(date).toUpperCase());
    }
}
