package com.company;

import java.util.Scanner;

public class ex073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " é par!");
        } else {
            System.out.println(a + " é ímpar!");
        }

        sc.close();
    }
}
