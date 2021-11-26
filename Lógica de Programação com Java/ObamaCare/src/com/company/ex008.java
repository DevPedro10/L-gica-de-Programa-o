package com.company;

import java.util.Scanner;

public class ex008 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo");

        float base = sc.nextFloat();

        System.out.println("Digite o valor da altura do triângulo");

        float altura = sc.nextFloat();

        float resultado = base * altura;

        System.out.println("A área do triângulo corresponde a: " + resultado);

        sc.close();
    }

}

