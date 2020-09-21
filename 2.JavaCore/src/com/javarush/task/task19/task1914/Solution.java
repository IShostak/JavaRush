package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();

        String text = outputStream.toString();
        String temp = text.replaceAll("\\s","");
        String res[] = temp.split("\\p{Punct}");

        String blabla = temp.replaceAll("\\d","").substring(0,1);
        int num = Integer.parseInt(res[0]);
        int num2 = Integer.parseInt(res[1]);
        int resNum = 0;

        if(blabla.equals("+")){
            resNum = num + num2;
        }
        if(blabla.equals("-")){
            resNum = num - num2;
        }
        if(blabla.equals("*")){
            resNum = num * num2;
        }


        String result = text + resNum;
        String res2 = result.replaceAll("\\n","");

        System.setOut(consoleStream);
        System.out.println(res2);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

