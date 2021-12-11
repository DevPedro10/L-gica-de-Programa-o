package com.company;

import java.util.Scanner;

public class ex089 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 15;
        int cont = 0;

        do {
            double num = Math.pow((double)cont, 2.0D);
            System.out.println(num);
            ++i;
            ++cont;
        } while(i < 200);

        System.out.println(cont);
        sc.close();
    }
}
