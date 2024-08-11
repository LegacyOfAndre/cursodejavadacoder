package basicjavaproject.operadores;

import java.util.Scanner;

public class tipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2".equals(s1));
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // .trim serve para tirar os espaços em branco quando digitado algum valor no console
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
