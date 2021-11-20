package listadeexercicios;

import java.util.Scanner;

public class Ex24TrocaAB {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		
		int b = sc.nextInt();
		
		 int a2 = a;
		 
	     int b2 = b;
	     
	     a = b2;
	     
	     b = a2;
		
		System.out.print("O valor de A é "+a+" e o de B é "+b);
		
		sc.close();	
	}

}
