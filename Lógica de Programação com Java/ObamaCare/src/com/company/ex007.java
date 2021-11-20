package exercicio;

import java.util.Scanner;
public class ex007 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor da base do retângulo: ");
		
		float base = sc.nextFloat();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		
		float altura = sc.nextFloat();
		
		float area = base * altura;
		
		System.out.println("O valor da área do retângulo corresponde a: " + area + " cm²");
		
		
		sc.close();
	}
}
