package exercicio;

import java.util.Scanner;

public class ex006 {

		public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro: ");
		
		int num = sc.nextInt();
		
		int antecessor = num - 1;
		
		System.out.println("O antecessor é " + antecessor);
		
		sc.close();
				
	}
}
