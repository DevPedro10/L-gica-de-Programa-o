package listadeexercicios;

import java.util.Scanner;

public class Ex34CustoMacas {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��s voc� deseja comprar?: ");
		
		int maca = sc.nextInt();
		
		if(maca>12) {
			double preco = maca*1.30;
			System.out.println("O pre�o da sua compra � de R$"+preco);
		}else {
			double preco=maca * 1;
			System.out.println("O pre�o da sua compra � de R$"+preco);
		}
		
		sc.close();
	}
}