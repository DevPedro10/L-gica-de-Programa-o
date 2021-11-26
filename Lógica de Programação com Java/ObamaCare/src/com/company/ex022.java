package com.company;

import java.util.Scanner;

public class ex022 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo gasto at� o destino: ");

        int tempo=sc.nextInt();

        System.out.println("Digite a velocidade m�dia: ");

        int velocidade = sc.nextInt();

        int distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.print("Com a velocidade de "+velocidade+"km/h durante "+tempo+" mins/h e a distancia de " +distancia+ "m/km a quantidade de litros usadas ser� de "+litrosUsados+"L");

        sc.close();

    }

}

