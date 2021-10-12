package com.pb.poliscuk.hw2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int my_val;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число = ");
        my_val = scan.nextInt();
        if (my_val>=0 && my_val<=14) System.out.println("Введенное значение находится в диапазоне [0..14]");
        if (my_val>=15 && my_val<=35) System.out.println("Введенное значение находится в диапазоне [15..35]");
        if (my_val>=36 && my_val<=50) System.out.println("Введенное значение находится в диапазоне [36..50]");
        if (my_val>=51 && my_val<=100) System.out.println("Введенное значение находится в диапазоне [51..100]");
    }
}
