package com.javarush.task.task34.task3411;

/* 
Ханойские башни
*/

import org.omg.CORBA.Any;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        int[] arr;
        String[] strings;

//        String s1 = "123";
//
//        System.out.println(s1.concat("Attention!"));
//
//        System.out.println(s1);
//
//        s1 = s1.concat("Be careful");
//
//        System.out.println(s1);

//        int season = Seasons.AUTUMN.ordinal();
//
//        System.out.println(season);
//
//        season = Seasons.WINTER.ordinal();
//
//        System.out.println(Seasons.AUTUMN.name());
//
//        Integer i = Integer.MAX_VALUE;

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(6);

        stringList.add("1");
        stringList.add("3");
        stringList.add("5");
        stringList.add("4");
        stringList.add("8");
        stringList.add("6");

        arr = list.stream().mapToInt(i->i).toArray();
        strings = stringList.toArray(new String[stringList.size()]);

        Arrays.sort(arr);
        Arrays.sort(strings);
        Collections.sort(list);
        Collections.sort(stringList);

        int k = setType(5);
        double d = setType(2.5d);

        System.out.println(k);
        System.out.println(d);

//        System.out.println("integers from array:");
//        Arrays.stream(arr).forEach(System.out::println);
//        System.out.println("strings from array:");
//        Arrays.stream(strings).forEach(System.out::println);
//        System.out.println("integers from list:");
//        list.stream().forEach(System.out::println);
//        System.out.println("string  from list:");
//        stringList.stream().forEach(System.out::println);
    }

    public static <AnyType extends Number> AnyType setType (AnyType t) {
        Object k = 0;

        if (t instanceof Integer) {
            int m = t.intValue();
            m *= m;
            k = m;
        }

        if (t instanceof Double) {
            double m = t.doubleValue();
            m *= m * 10;
            k = m;
        }

        return (AnyType)k;
    }

    static String find(final String text) {
        Stack<Character> stack = new Stack<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < text.length(); i += 26) {
            for (char c :  alphabet.toCharArray()) {
                stack.add(c);
            }
        }

        stack.sort(Character::compareTo);

        for (char c : text.toCharArray()) {
            if (stack.isEmpty()) break;

            if (stack.contains(c)) {
                stack.remove(stack.indexOf(c));
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
