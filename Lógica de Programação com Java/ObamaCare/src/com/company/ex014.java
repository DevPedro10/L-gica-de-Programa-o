package exercicio;


import java.util.Scanner;
public class ex014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor atual do sal�rio: ");
		
		float salario = sc.nextFloat();
		
		System.out.print("Digite o valor do reajuste: ");
		
		float reajuste = sc.nextFloat();
		
		float calcFinal = salario + ((salario * reajuste) / 100); 
		
		
		System.out.println("O sal�rio de R$" + salario + " com o reajuste, � igual �: R$" +calcFinal);
		
		
		sc.close();
	}

	
	
}
