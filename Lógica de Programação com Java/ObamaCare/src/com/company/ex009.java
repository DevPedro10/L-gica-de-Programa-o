package exercicio;

import java.util.Scanner;

public class ex009 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor do raio do c�rculo: ");
		
		float raio = sc.nextFloat();
		
		float area = (float) ((raio * raio) * 3.14);
		
		System.out.print("O valor da �rea do c�rculo corresponde a:" + area);
		
		sc.close();
	}
}
