package exercicio;

import java.util.Scanner;
public class ex007 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor da base do ret�ngulo: ");
		
		float base = sc.nextFloat();
		
		System.out.print("Digite o valor da altura do ret�ngulo: ");
		
		float altura = sc.nextFloat();
		
		float area = base * altura;
		
		System.out.println("O valor da �rea do ret�ngulo corresponde a: " + area + " cm�");
		
		
		sc.close();
	}
}
