package com.company;

import java.util.Scanner;

public class ex097 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        boolean var4 = false;

        int valor;
        int menor;
        do {
            System.out.println("Informe um número inteiro: *Para parar basta escrever um número negativo*");
            valor = sc.nextInt();
            menor = valor;
            if (valor > maior) {
                maior = valor;
            }

            if (valor < valor) {
                menor = valor;
            }
        } while(valor >= 0);

        System.out.println("Maior: " + maior + " | Menor: " + menor);
        sc.close();
    }
}
