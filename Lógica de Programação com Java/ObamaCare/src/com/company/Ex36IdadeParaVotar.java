package listadeexercicios;

import java.util.Scanner;

public class Ex36IdadeParaVotar {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano do seu nascimento: ");
		
		int anoNasc = sc.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		if (idade>=16) {
			System.out.println("Voc� pode votar!");
		}else {
			System.out.println("Voc� n�o pode votar esse ano! ");
		}
	
		sc.close();
	}
	
}
