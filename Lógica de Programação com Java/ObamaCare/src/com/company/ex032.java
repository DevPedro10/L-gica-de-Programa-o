package com.company;

import java.util.Scanner;

public class ex032 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");

        int n1 = sc.nextInt();

        if (n1 > 10) {
            System.out.println("É maior que 10");
        } else {
            System.out.println("É menor que 10");
        }

        sc.close();
    }
}
