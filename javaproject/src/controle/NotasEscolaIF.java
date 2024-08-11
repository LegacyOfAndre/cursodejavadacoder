package controle;

import java.util.Scanner;

public class NotasEscolaIF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota;
		
		System.out.println("Digite a nota do aluno: ");
		nota = entrada.nextDouble();
		
		if(nota < 0 || nota > 10) {
			System.out.println("Por favor digite uma nota válida.");
		} else if(nota == 10) {
			System.out.println("Parabéns você está entre os melhores.");
		} else if(nota >= 8) {
			System.out.println("Parabéns você conseguiu uma ótima nota.");
		} else if(nota >= 6) {
			System.out.println("Você está de conseguiu passar.");
		} else if(nota >= 4) {
			System.out.println("Você está de recuperação.");
		} else {
			System.out.println("Você infelizmente reprovou.");
		}
		

		entrada.close();
	}
}
