package com.javarush.task.task14.task1419;

import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();



        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
       exceptions.add(new PrinterException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IOException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NullPointerException());
        exceptions.add(new TimeoutException());
        exceptions.add(new InterruptedException());

    }

}
