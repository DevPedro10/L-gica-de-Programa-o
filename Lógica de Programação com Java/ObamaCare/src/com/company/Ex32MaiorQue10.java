package listadeexercicios;

/*Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
contr�rio escrever N�O � MAIOR QUE 10!*/

import java.util.Scanner;

public class Ex32MaiorQue10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero:");

		int n1 = sc.nextInt();

		if (n1 > 10) {
			System.out.println("� maior que 10");
		} else {
			System.out.println("� menor que 10");
		}
		
		sc.close();
	}

}
