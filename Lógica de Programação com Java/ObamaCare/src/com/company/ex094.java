package com.company;

import java.util.Scanner;

public class ex094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        boolean var4 = false;

        int valor;
        do {
            System.out.println("Informe um número: *Digite um número negativo para terminar*");
            valor = sc.nextInt();
            if (valor < 0) {
                break;
            }

            soma += valor;
            ++i;
        } while(valor >= 0);

        System.out.println("Total de números: " + i + " | Média: " + soma / i + " | Soma: " + soma);
        sc.close();
    }
}
