package basicjavaproject;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); /* Aqui é necessário o nextLine pela quebra de linha
		que o java faz automaticamente adicionando um "\n" */
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		entrada.close();
	}
}
