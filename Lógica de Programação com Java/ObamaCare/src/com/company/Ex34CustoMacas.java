package listadeexercicios;

import java.util.Scanner;

public class Ex34CustoMacas {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçãs você deseja comprar?: ");
		
		int maca = sc.nextInt();
		
		if(maca>12) {
			double preco = maca*1.30;
			System.out.println("O preço da sua compra é de R$"+preco);
		}else {
			double preco=maca * 1;
			System.out.println("O preço da sua compra é de R$"+preco);
		}
		
		sc.close();
	}
}