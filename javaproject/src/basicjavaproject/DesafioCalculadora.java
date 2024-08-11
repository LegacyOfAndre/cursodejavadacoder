package basicjavaproject;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operacão: ");
		String operador = entrada.next();
		
		 
		
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 + num2 : resultado;
		resultado = "*".equals(operador) ? num1 + num2 : resultado;
		resultado = "/".equals(operador) ? num1 + num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2);
		entrada.close();
	}

}
