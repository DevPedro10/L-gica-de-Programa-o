package com.company;

import java.util.Scanner;

public class ex004 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        float valor=sc.nextInt();

        System.out.print("Digite outro número: ");

        float valor2=sc.nextInt();

        float divisao=  valor / valor2;

        System.out.println("A divisão entre os dois valores é " +divisao);

        sc.close();

    }

}
