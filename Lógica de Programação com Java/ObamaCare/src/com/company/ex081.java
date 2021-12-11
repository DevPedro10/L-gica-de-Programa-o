package com.company;

import java.util.Scanner;

public class ex081 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acul = 0;
        int cont = 0;

        while(cont < 15) {
            if (acul == 0) {
                acul = 3;
            } else {
                acul *= 3;
            }

            ++cont;
            System.out.println(acul);
        }

        sc.close();
    }
}
