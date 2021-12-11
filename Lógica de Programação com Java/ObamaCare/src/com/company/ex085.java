package com.company;

import java.util.Scanner;

public class ex085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int soma = 0;

        double media;
        for(media = 0.0D; cont <= 10; ++cont) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("Soma total dos valores: " + soma);
        media = (double)(soma / 10);
        System.out.println("Média aritmética dos valores lidos: " + media);
        sc.close();
    }
}
