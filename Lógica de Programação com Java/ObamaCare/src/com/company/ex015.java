package com.company;

import java.util.Scanner;

public class ex015 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor: ");

        int num =  sc.nextInt();

        if (num > 10) {
            System.out.println(num + " é maior que 10.");
        } else {
            System.out.println(num + " é menor que 10.");
        }

        sc.close();
    }

}
