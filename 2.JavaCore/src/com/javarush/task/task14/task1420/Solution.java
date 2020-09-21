package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a=0,b=0;

            a = Integer.parseInt(scanner.nextLine());
            b = Integer.parseInt(scanner.nextLine());
            if (a <= 0 || b <= 0) throw new Exception();


        scanner.close();
        int nod;
        if (a > b){
            nod =a;
        }
        else nod = b;



        while (true){
            if( a %nod ==0 && b %nod ==0){
                System.out.println(nod);
                break;
            }
            else nod--;
        }
    }
}
