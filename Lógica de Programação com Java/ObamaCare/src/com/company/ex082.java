package com.company;

import java.util.Scanner;

public class ex082 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do dividendo:");
        int dividendo = sc.nextInt();
        System.out.println("Digite o valor do divisor:");

        int divisor;
        for(divisor = sc.nextInt(); divisor > dividendo; divisor = sc.nextInt()) {
            System.out.println("Não é possível efetuar a divisão");
            System.out.println("Digite o valor do dividendo:");
            dividendo = sc.nextInt();
            System.out.println("Digite o valor do divisor:");
        }

        double potencia = Math.pow((double)dividendo, (double)divisor);
        System.out.println(potencia);
        sc.close();
    }
}
