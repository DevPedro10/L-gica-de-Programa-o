package com.company;

import java.util.Scanner;

public class ex101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i = 0; i < 101; ++i) {
            total += i;
            System.out.println(total);
        }

        sc.close();
    }
}
