package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStrem = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();

        String res = outputStream.toString();
        System.setOut(consoleStrem);

        String[] lines = res.split("\n");
        int counter = 1;
        for(String s:  lines) {
            System.out.println(s);
            counter++;
            if(counter > 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                counter = 1;
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
