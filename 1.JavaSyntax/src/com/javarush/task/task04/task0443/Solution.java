package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year= scanner.nextInt();
        int month = scanner.nextInt();
        int day  = scanner.nextInt();
        scanner.close();
        System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name, day,month,year);

    }
}
