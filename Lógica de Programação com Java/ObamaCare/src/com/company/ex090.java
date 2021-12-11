package com.company;

import java.util.Scanner;

public class ex090 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int valor = 0;

        do {
            if (i % 2 == 0) {
                valor += i;
                System.out.println(valor);
            }

            ++i;
        } while(i < 500);

        System.out.println("Fim!");
        sc.close();
    }
}
