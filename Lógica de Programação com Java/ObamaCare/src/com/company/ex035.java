package com.company;

import java.util.Scanner;

public class ex035 {


    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1° nota: ");

        float nota1 = sc.nextFloat();

        System.out.println("Digite a 2° nota: ");

        float nota2 = sc.nextFloat();

        double media = (nota1 + nota2) / 2;

        if (media>=6) {
            System.out.println("Aprovado! Sua média é " +media);
        }else {
            System.out.println("Reprovado! Sua média é " +media);
        }

        sc.close();
    }
}
