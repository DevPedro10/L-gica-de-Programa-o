package com.company;

import java.util.Scanner;

public class ex045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = sc.nextInt();
        float prod1 = (float)(a * b);
        float prod2 = (float)(a * d);
        float soma = (float)(b + d);
        System.out.println(a + "X" + c + "=" + prod1);
        System.out.println(a + "X" + d + "=" + prod2);
        System.out.println(b + "+" + d + "=" + soma);
        sc.close();
    }
}
