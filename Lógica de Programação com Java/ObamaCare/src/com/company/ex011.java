package com.company;

import java.util.Scanner;

public class ex011 {

    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor da base do retângulo: ");

        float base = sc.nextFloat();

        System.out.print("Digite o valor da altura do retângulo: ");

        float altura = sc.nextFloat();

        float area = base * altura;

        System.out.print("O valor da área do retângulo corresponde a: " + area);

        sc.close();
    }
}
