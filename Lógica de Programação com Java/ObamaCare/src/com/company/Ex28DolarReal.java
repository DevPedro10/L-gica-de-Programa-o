package listadeexercicios;

import java.util.Scanner;

public class Ex28DolarReal {

	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de cota��o do d�lar hoje: ");
		
		int cotacao =sc.nextInt();
		
		System.out.println("Digite quantos d�lares voc� deseja converter: ");
		
		int dolar = sc.nextInt();
		
		int real = cotacao * dolar;
	
		System.out.print("Seus $"+dolar+" d�lares s�o R$"+real+" reais.");
		
		sc.close();	
		
		}
	
}
