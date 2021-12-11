package com.company;

import java.util.Scanner;

public class ex102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i = 1; i <= 500; ++i) {
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
