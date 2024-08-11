package controle;

import java.util.Scanner;

public class CompraLivros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double livroJava;
		double livroLinux;
		
		System.out.println("Entre com o preço do livro de Linux:");
		livroLinux = entrada.nextDouble();
		
		System.out.println("Entre com o preço do livro de Java:");
		livroJava = entrada.nextDouble();
		
		double total = livroLinux + livroJava;
		System.out.printf("Preço total é %.2f%n", total);
	
		if(livroLinux == 10) {
			System.out.println("Livro de Linux quase de graça.");
		}
		
		if(total <= 120) {
			System.out.println("Está por um bom preço.");
		} else {
			System.out.println("Está muito caro esses livros.");
		}
		
		if(livroLinux < livroJava) {
			System.out.println("Livro de Linux está mais barato.");
		} else if(livroLinux > livroJava) {
			System.out.println("Livro de Java está mais barato.");
		}else {
			System.out.println("Estão ambos livros no mesmo preço.");
		}

		entrada.close();
		
	}
}
