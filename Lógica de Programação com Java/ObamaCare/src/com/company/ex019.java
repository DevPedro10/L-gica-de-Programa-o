package com.company;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");

        float fahrenheit=sc.nextFloat();

        float celsius = (fahrenheit - 32) * 5/9;

        System.out.print("A temperatura em Celsius é: "+celsius+" C°");

        sc.close();

    }
}
