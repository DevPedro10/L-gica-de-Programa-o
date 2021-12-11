package com.company;

import java.util.Scanner;

public class ex109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 10; i += 2) {
            int fatorial = 1;

            for(int auxiliar = i; auxiliar > 1; --auxiliar) {
                fatorial *= auxiliar - 1;
            }

            System.out.println("Número " + i + " : " + fatorial);
        }

        sc.close();
    }
}
