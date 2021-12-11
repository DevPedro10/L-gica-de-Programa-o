package com.company;

import java.util.Scanner;

public class ex054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1 + " e maior do que " + valor2);
        } else if (valor1 == valor2) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println(valor2 + " é maior do que " + valor1);
        }

        sc.close();
    }
}
