package listadeexercicios;

import java.util.Scanner;

public class Ex37MaiorNumero {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		
		int n2 = sc.nextInt();
		
		if (n1 == n2) {
            System.out.println("Os valores n�o podem ser iguais!");
        }else if(n1>n2){
        	System.out.println("O maior n�mero � o "+n1);
        }else{
        	System.out.println("O maior n�mero � o "+n2);
        }
	
		sc.close();
	}
	
}
