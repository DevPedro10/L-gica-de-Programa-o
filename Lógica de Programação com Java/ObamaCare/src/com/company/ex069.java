package com.company;

import java.util.Scanner;

public class ex069 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        float a = sc.nextFloat();
        System.out.println("Digite o valor de B: ");
        float b = sc.nextFloat();
        System.out.println("Digite o valor de C: ");
        float c = sc.nextFloat();
        double delta = Math.pow((double)b, 2.0D) - (double)(4.0F * a * c);
        if (delta < 0.0D) {
            System.out.println("Não há raizes reais");
        } else {
            double x1;
            if (delta == 0.0D) {
                x1 = (double)(b / 2.0F * a);
                System.out.println("Uma única raiz real: x =" + x1);
            } else if (delta > 0.0D) {
                x1 = (double)(-b) + Math.sqrt(delta) / (double)(2.0F * a);
                double x2 = (double)(-b) + Math.sqrt(delta) / (double)(2.0F * a);
                System.out.println("Duas Raízes reais e diferentes: x1=" + x1 + " & x2=" + x2);
            }
        }

        sc.close();
    }
}
