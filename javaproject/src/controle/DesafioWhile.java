package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double entradaNota = 0;
		double totalNota = 0;
		do {
			System.out.println("Digite a nota do aluno: ");
			entradaNota = entrada.nextDouble();

			totalNota = totalNota + entradaNota;
			System.out.printf("Esse é o valor total de todas as notas: %.2f\n", totalNota);

			double mediaTotal = totalNota / 2;
			System.out.printf("Esse é o valor total de todas as médias: %.2f\n", mediaTotal);
			System.out.println("==============================================");

		} while (entradaNota != -1);

		System.out.println("Saindo...");
		entrada.close();
	}
}
