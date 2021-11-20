package listadeexercicios;

import java.util.Scanner;

public class Ex19CelsiusFahrenheit {
	
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Celsius: ");
	
	float celsius=sc.nextFloat();
	
	float fahrenheit = (9 * celsius + 160)/5;
	
	System.out.print("A temperatura em Fahrenheit é: "+fahrenheit+" C°");
	
	sc.close();
	
	}
	
}


