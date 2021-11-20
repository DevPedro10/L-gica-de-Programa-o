package exercicio;

import java.util.Scanner;

	public class ex005 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um número inteiro: ");
	
	int num=sc.nextInt();
	
	int sucessor = num+1;
	
	System.out.println("A divisão entre os dois valores é " +sucessor);
	
	sc.close();
	
	}	
	
}
