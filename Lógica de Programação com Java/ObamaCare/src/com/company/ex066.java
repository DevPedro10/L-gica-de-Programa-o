package com.company;

import java.util.Scanner;

public class ex066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negativo: " + num + ". Positivo: " + num * -1);
        } else if (num > 0) {
            System.out.println("O número já está positivo.");
        } else if (num == 0) {
            System.out.println("O número é neutro, não é possivel inverter o valor dela.");
        }

        sc.close();
    }
}
