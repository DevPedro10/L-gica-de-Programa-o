package listadeexercicios;

import java.util.Scanner;

public class Ex18MediaPonderada {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		
		float n1=sc.nextFloat();
		
		System.out.println("Digite a 2° nota: ");
		
		float n2=sc.nextFloat();
		
		System.out.println("Digite a 3° nota: ");
		
		float n3=sc.nextFloat();
		
		float media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.print("A sua média é: "+media);
		
		sc.close();
		
		}
}