package com.company;

import java.util.Scanner;

public class ex068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota do aluno: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite a quarta nota do aluno: ");
        float nota4 = sc.nextFloat();
        double media = (double)((nota1 + nota2 + nota3 + nota4) / 4.0F);
        if (media >= 7.0D) {
            System.out.println("Com a média de " + media + ", o aluno foi APROVADO.");
        } else if (media < 7.0D) {
            System.out.println("Nota do exame: ");
            float exame = sc.nextFloat();
            double mediaComExame = media + (double)exame;
            if (mediaComExame >= 5.0D) {
                System.out.println("Com a média de " + mediaComExame + ", o aluno foi APROVADO com exame.");
            } else if (mediaComExame < 5.0D) {
                System.out.println("Com a média de " + mediaComExame + ", o aluno foi REPROVADO com exame.");
            }
        }

        sc.close();
    }
}
