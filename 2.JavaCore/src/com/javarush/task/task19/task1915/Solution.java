package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String file = scanner.readLine();
        scanner.close();

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String res = outputStream.toString();

        FileOutputStream bw = new FileOutputStream(file);
        bw.write(outputStream.toByteArray());
        bw.close();

        System.setOut(consoleStream);
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

