package basicjavaproject;

import java.util.Scanner;

public class DasafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salário: ");
		String num1 = entrada.nextLine();
		
		System.out.print("Digite o valor do segundo salário: ");
		String num2 = entrada.nextLine();
		
		System.out.print("Digite o valor do terceiro salário: ");
		String num3 = entrada.nextLine();
		
		double converte1 = Double.parseDouble(num1);
		
		double converte2 = Double.parseDouble(num2);
		
		double converte3 = Double.parseDouble(num3);
		
		System.out.printf("Primeiro salário %.2f \n", converte1);
		System.out.printf("Segundo salário %.2f \n", converte2);
		System.out.printf("Terceiro salário %.2f \n", converte3);
		
		System.out.println("");
		
		double media = (converte1 + converte2 + converte3) / 3;
		
		System.out.printf("A média do salário é %.2f", media);
				
		entrada.close();
	}
}
