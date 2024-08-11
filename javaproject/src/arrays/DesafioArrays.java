package arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Diga a quantidade de notas: ");
		
		double[] notas = new double[entrada.nextInt()];
		System.out.println(notas.length);
		
		System.out.println("Digite as notas: ");
		
		double notaEntrada = notas.length;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("" + notaEntrada);
		}

		entrada.close();
	}
}
