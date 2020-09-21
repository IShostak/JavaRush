package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private  Scanner  fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String temp[] = fileScanner.nextLine().split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(temp[5]),
                    Integer.parseInt(temp[4]) - 1, Integer.parseInt(temp[3]));
            return new Person(temp[1],temp[2], temp[0], calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
