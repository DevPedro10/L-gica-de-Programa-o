package exercicio;

import java.util.Scanner;

public class ex016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Digite um valor: ");
		
		int num =  sc.nextInt();
		
		if (num >= 0) {
			System.out.println(num + " é um número POSITIVO.");
		} else {
			System.out.println(num + " é um número NEGATIVO.");
		}
		
		sc.close();
	}
	
}
