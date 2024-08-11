package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String saida = "";
		
		while(!saida.equalsIgnoreCase("sair")) {
			System.out.println("Digite a palavra correta para sair: ");
			saida = entrada.nextLine();
		}
		
		entrada.close();
	}
}
