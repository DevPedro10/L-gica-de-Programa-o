package com.company;

import java.util.Scanner;

public class ex010 {

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor de um dos lados do Quadrado: ");

        float lado1 = sc.nextFloat();

        float resultado = lado1*lado1;

        System.out.println("A área do Quadrado é " + resultado);

        sc.close();

    }
}
