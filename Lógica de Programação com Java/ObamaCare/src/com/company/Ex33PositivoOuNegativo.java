package listadeexercicios;

import java.util.Scanner;

public class Ex33PositivoOuNegativo {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int n1 = sc.nextInt();
		
		if(n1>=0) {
			System.out.println("� positivo!");
		}else {
			System.out.println("� Negativo!");
		}
		
		sc.close();
	}

}
