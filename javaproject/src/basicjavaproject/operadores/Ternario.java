package basicjavaproject.operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media = entrada.nextInt();
		
		String resultado  = media >= 7 ? "Aprovado" : "Recupeção";
		
		System.out.println(resultado);
		
		entrada.close();
		
	}
}
