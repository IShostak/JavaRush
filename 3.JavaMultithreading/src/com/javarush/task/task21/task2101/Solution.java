package com.javarush.task.task21.task2101;

import java.util.ArrayList;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] result = new byte[4];
        for ( int i =0 ; i < ip.length; i++ ) {
            result[i] = (byte)(ip[i] & mask[i]);
        }
        return result;
    }

    public static void print(byte[] bytes) {
        int last = bytes.length - 1;

        for (int i = 0; i < last; i++ ) {
            printBytes(bytes[i], " ");
        }
        printBytes(bytes[last], "\n");
    }

    private static void printBytes(int number, String message) {
        String s =  Integer.toBinaryString((number & 0xFF) + 0x100).substring(1);
        System.out.print(s + message);
    }
//    private static void printBytes2(byte num, String message) {
//        int number = num & 0xFF, base = 2, power = 1;
//        String result = "";
//        ArrayList<Integer> bytes = new ArrayList<>();
//
//        for ( int tmp = number / base; power <= tmp; power *= base );
//
//        for ( ; power >= base; power /= base ) {
//            bytes.add(number/power);
//            number %= power;
//        }
//        bytes.add(number/power);
//
//        for ( ; bytes.size() < 8; ) {
//            bytes.add(0,0);
//        }
//        for ( int i  : bytes ) {
//            result += i;
//        }
//        System.out.print(result + message);
//    }
}
