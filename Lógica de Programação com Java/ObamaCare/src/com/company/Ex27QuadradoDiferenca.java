package listadeexercicios;

import java.util.Scanner;

public class Ex27QuadradoDiferenca {

	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		
		int a =sc.nextInt();
		
		System.out.println("Digite Digite o valor de B: ");
		
		int b = sc.nextInt();
		
		int diferenca = a - b;
		
		double quadrado = Math.pow(diferenca, 2);
		
		System.out.print("O quadrado da diferen�a de "+a+" e "+b+" � de " +quadrado);
		
		sc.close();	
		
		}
	
}
