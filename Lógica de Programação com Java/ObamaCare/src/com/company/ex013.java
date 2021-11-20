package exercicio;

import java.util.Scanner;

public class ex013 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Qual o total de eleitores? ");
		
		int totalEleitores = sc.nextInt();
		
		System.out.print("Qual é o total de votos brancos? ");
		
		int votosBrancos = sc.nextInt();
		
		System.out.print("Qual é o total de votos nulos? ");
		
		int votosNulos = sc.nextInt();
		
		System.out.print("Qual é o total de votos válidos? ");
		
		int votosValidos = sc.nextInt();
		
		
		
		int percentualVotosBrancos = (votosBrancos * 100 ) / totalEleitores;
		int percentualVotosNulos = (votosNulos * 100 ) / totalEleitores;
		int percentualVotosValidos = (votosValidos * 100 ) / totalEleitores;
		
		
		System.out.println("A porcentagem de votos brancos corresponde a: " + percentualVotosBrancos + "% de Eleitores");
		System.out.println("A porcentagem de votos nulos corresponde a: " + percentualVotosNulos + "% de Eleitores");
		System.out.println("A porcentagem de votos válidos corresponde a: " + percentualVotosValidos + "% de Eleitores");
		
		sc.close();		
		
	}
	
}
