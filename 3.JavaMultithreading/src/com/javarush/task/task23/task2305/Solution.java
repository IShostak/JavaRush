package com.javarush.task.task23.task2305;

import java.util.HashSet;
import java.util.Set;

/*
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] array = new Solution[2];
        Solution sol = new Solution();
        Solution sol2 = new Solution();

        sol.innerClasses[0] = sol.new InnerClass();
        sol.innerClasses[1] = sol.new InnerClass();

        sol2.innerClasses[0] = sol2.new InnerClass();
        sol2.innerClasses[1] = sol2.new InnerClass();

        array[0] = sol;
        array[1] = sol2;
        return array;
    }

    public static void main(String[] args) {
        char c = 65;
        int x = 13;
        double k = 6.6;

        c += x;

        x += k;

        System.out.println(c);
        System.out.println(x);

    }
}
