package com.company;

import java.util.Scanner;

public class ex083 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atual = 1;
        int anterior = 0;
        int x = 1;

        while(x < 21) {
            ++x;
            int novo = atual + anterior;
            anterior = atual;
            atual = novo;
            System.out.println(novo);
        }

        sc.close();
    }
}
