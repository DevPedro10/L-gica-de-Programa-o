package com.company;

import java.util.Scanner;

public class ex104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 200; ++i) {
            if (i % 4 == 0) {
                System.out.println("Divisivel por 4: " + i);
            }
        }

        sc.close();
    }
}
