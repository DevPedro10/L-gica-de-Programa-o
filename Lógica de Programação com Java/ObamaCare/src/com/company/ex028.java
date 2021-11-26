package com.company;

import java.util.Scanner;

public class ex028 {

    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de cotação do dólar hoje: ");

        int cotacao =sc.nextInt();

        System.out.println("Digite quantos dólares você deseja converter: ");

        int dolar = sc.nextInt();

        int real = cotacao * dolar;

        System.out.print("Seus $"+dolar+" dólares são R$"+real+" reais.");

        sc.close();

    }
}
