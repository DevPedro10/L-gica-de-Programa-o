package listadeexercicios;

/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!*/

import java.util.Scanner;

public class Ex32MaiorQue10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");

		int n1 = sc.nextInt();

		if (n1 > 10) {
			System.out.println("É maior que 10");
		} else {
			System.out.println("É menor que 10");
		}
		
		sc.close();
	}

}
