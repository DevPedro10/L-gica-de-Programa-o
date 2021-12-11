package com.company;

import java.util.Scanner;

public class ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        float hrsTrabalhadas = sc.nextFloat();
        System.out.println("Digite o seu salário por hora: ");
        double salarioHora = sc.nextDouble();
        double aumento;
        if (hrsTrabalhadas > 160.0F) {
            aumento = salarioHora * 0.0D;
            double salarioFinal = salarioHora * (double)hrsTrabalhadas + aumento;
            System.out.println("Seu salário é R$" + salarioFinal);
        } else {
            aumento = salarioHora * (double)hrsTrabalhadas;
            System.out.println("Seu salário é R$" + aumento);
        }

        sc.close();
    }
}
