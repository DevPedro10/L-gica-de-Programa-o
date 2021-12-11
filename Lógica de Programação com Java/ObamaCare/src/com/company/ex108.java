package com.company;

import java.util.Scanner;

public class ex108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;

        for(int i = 10; i <= 100; i += 10) {
            int f = (9 * i + 160) / 5;
            ++cont;
            System.out.println(cont + "°: " + i + "°C - " + f + "°F");
        }

        sc.close();
    }
}
