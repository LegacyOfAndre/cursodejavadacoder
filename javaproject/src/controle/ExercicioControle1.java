package controle;

import java.util.Scanner;

public class ExercicioControle1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.printf("O numero %d está entre 0 e 10 e é par.", numero);
			} else {
				System.out.printf("O numero %d está entre 0 e 10 e não é par.", numero);
			}
		} else {
			System.out.printf("O numero %d não está entre 0 e 10.", numero);
		}
		
		entrada.close();
	}
}
