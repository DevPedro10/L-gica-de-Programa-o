package listadeexercicios;

import java.util.Scanner;

public class Ex21VolumeLata {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata: ");
		
		int raio=sc.nextInt();
		
		System.out.println("Digite a altura da lata: ");
		
		int altura = sc.nextInt();
		
		double volume = Math.PI * (Math.pow(raio, 2)) * altura;
		
		System.out.print("O volume da lata é: "+volume);
		
		sc.close();	
		
	}

}
