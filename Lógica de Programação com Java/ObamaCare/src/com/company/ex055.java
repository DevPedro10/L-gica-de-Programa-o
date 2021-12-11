package com.company;

import java.util.Scanner;

public class ex055 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o N°01: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o N°02: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O Primeiro numero é maior");
        }

        if (num2 > num1) {
            System.out.println("O Segundo numero é maior");
        }

        if (num1 == num2) {
            System.out.println("Números iguais");
        }

        sc.close();
    }
}
