package exercicio;

import java.util.Scanner;

public class ex012 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite quantos anos de vida você tem: ");
		
		int anos = sc.nextInt();
		
		System.out.print("Digite quantos meses de vida você tem: ");
		
		int meses = sc.nextInt();
		
		System.out.print("Digite quantos dias de vida você tem: ");
		
		int dias = sc.nextInt();
		
		int resultado = (anos * 365) + (meses * 30) + dias;
		
		System.out.print("Somando a quantidade de anos, meses e dias, você tem exatamente " + resultado + " dias de vida.");
		
		sc.close();
	}
}
