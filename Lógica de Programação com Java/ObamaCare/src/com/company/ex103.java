package com.company;

import java.util.Scanner;

public class ex103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; ++i) {
            if (i % 2 == 1) {
                System.out.println("Número Ímpar: " + i);
            }
        }

        sc.close();
    }
}
