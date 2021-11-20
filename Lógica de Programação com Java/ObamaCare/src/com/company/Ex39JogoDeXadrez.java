package listadeexercicios;

import java.util.Scanner;

public class Ex39JogoDeXadrez {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora do ínício da partida: ");
		
		int hrInicio = sc.nextInt();
		
		System.out.println("Digite a hora do fim da partida ");
		
		int hrFim = sc.nextInt();
		
		if (hrInicio >= hrFim) {
            int duracao = (24 - hrInicio) + hrFim;
            System.out.println("A partida de xadrez durou " +duracao+ " horas!");
        }else{
            int duracao = hrFim - hrInicio;
            System.out.println("A partida de xadrez durou " +duracao+ " horas!");
        }
		
		sc.close();
	}
	
}
