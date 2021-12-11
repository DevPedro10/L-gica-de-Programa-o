package com.company;

import java.util.Scanner;

public class ex105 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for(int i = 0; i <= 15; ++i) {
            result = i == 0 ? 1 : result * 3;
            System.out.println("Resultado de 3 ^ " + i + " = " + result);
        }

        sc.close();
    }
}
