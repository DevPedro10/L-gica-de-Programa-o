package com.company;

import java.util.Scanner;

public class ex099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int cont = 1;

        for(float i = 15.0F; i < 200.0F; ++i) {
            valor = Math.pow((double)i, 2.0D);
            System.out.println(valor);
            ++cont;
        }

        System.out.println(cont);
        sc.close();
    }
}
