package listadeexercicios;

import java.util.Scanner;

public class Ex29RealDolar {

	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos reais você deseja converter: ");
		
		int real = sc.nextInt();
		
		double dolar = 0.18 * real;
	
		System.out.print("Seus R$"+real+" reais são $"+dolar+" dólares.");
		
		sc.close();	
		
		}
	
}
