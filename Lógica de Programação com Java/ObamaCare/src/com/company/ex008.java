package exercicio;

import java.util.Scanner;

public class ex008 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do tri�ngulo");
		
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do tri�ngulo");
		
		float altura = sc.nextFloat();
		
		float resultado = base * altura;
		
		System.out.println("A �rea do tri�ngulo corresponde a: " + resultado);
		
		sc.close();
	}
	
}
