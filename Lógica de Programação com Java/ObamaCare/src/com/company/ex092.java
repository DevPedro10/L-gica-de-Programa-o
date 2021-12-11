package com.company;

import java.util.Scanner;

public class ex092 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float graos = 1.0F;
        float num = 0.0F;

        do {
            graos *= 2.0F;
            num += graos;
            ++i;
            System.out.println(graos);
        } while(i < 63);

        System.out.println("Quantidade do total de grãos: " + graos);
        sc.close();
    }
}
