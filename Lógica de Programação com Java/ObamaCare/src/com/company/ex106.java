package com.company;

import java.util.Scanner;

public class ex106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a base da potência?");
        int b = sc.nextInt();
        System.out.println("Qual o valor do expoente?");
        int e = sc.nextInt();
        int aux = b;

        for(int i = 0; i <= e; ++i) {
            b = i == 0 ? 1 : b * aux;
        }

        System.out.println("O Resultado é equivalente a: " + b);
        sc.close();
    }
}
