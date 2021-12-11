package com.company;

import java.util.Scanner;

public class ex078 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acul = 0;

        for(int cont = 0; cont < 101; ++cont) {
            acul += cont;
        }

        System.out.println("A soma dos cem primeiros números inteiros é " + acul);
        sc.close();
    }
}
