package exercicio;

import java.util.Scanner;

public class ex004 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um n�mero: ");
	
	float valor=sc.nextInt();
	
	System.out.print("Digite outro n�mero: ");
	
	float valor2=sc.nextInt();
	
	float divisao=  valor / valor2;
	
	System.out.println("A divis�o entre os dois valores � " +divisao);
	
	sc.close();
	
	}	

}
