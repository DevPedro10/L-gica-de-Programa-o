package com.company;

import java.util.Scanner;

public class ex107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int result = 1;

        for(int indice = 0; indice < 15; ++indice) {
            int auxiliar = result;
            result = soma;
            soma += auxiliar;
            System.out.println(indice + 1 + ":" + soma);
        }

        sc.close();
    }
}
