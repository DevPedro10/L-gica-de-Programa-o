package com.company;

import java.util.Scanner;

public class ex009 {

    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor do raio do círculo: ");

        float raio = sc.nextFloat();

        float area = (float) ((raio * raio) * 3.14);

        System.out.print("O valor da área do círculo corresponde a:" + area);

        sc.close();
    }
}
