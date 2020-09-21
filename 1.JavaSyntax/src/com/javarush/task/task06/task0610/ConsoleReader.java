package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.nextLine();
        scanner.close();
        return  s;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int s =  scanner.nextInt();
        scanner.close();
        return  s;
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double s =  scanner.nextDouble();
        scanner.close();
        return  s;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean s =  scanner.nextBoolean();
        scanner.close();
        return  s;

    }

    public static void main(String[] args) {

    }
}
