package com.company;

import java.util.Scanner;

public class ex042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário fixo do vendedor: ");
        float salarioFixo = sc.nextFloat();
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor: ");
        float valorVendas = sc.nextFloat();
        double salarioFinal;
        if (valorVendas <= 1500.0F) {
            salarioFinal = (double)(salarioFixo + valorVendas * 3.0F / 100.0F);
            System.out.println("O salário final do vendedor corresponde a : R$" + salarioFinal);
        } else {
            salarioFinal = (double)(salarioFixo + 45.0F + (valorVendas - 1500.0F) * 5.0F / 100.0F);
            System.out.println("O salário final do vendedor corresponde a : R$" + salarioFinal);
        }

        sc.close();
    }
}
