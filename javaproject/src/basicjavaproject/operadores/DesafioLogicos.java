package basicjavaproject.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na terça
		
		//Trabalho na quinta
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean tormarSorvete = trabalho1 || trabalho2;
		
		System.out.printf("Trabalho1: %b%nTrabalho2: %b", trabalho1, trabalho2);
		System.out.printf("\nVamos comprar uma TV de 50! Vamos tomar sorvete? %b", tormarSorvete);
		
		trabalho1 = false;
		trabalho2 = true;
		tormarSorvete = trabalho1 || trabalho2;
		System.out.printf("\nTrabalho1: %b%nTrabalho2: %b", trabalho1, trabalho2);
		System.out.printf("\nVamos comprar uma TV de 50! Vamos tomar sorvete? %b", tormarSorvete);
	
		trabalho1 = false;
		trabalho2 = false;
		tormarSorvete = trabalho1 || trabalho2;
		System.out.printf("\nTrabalho1: %b%nTrabalho2: %b", trabalho1, trabalho2);
		System.out.printf("\nVamos comprar uma TV de 50! Vamos tomar sorvete? %b", tormarSorvete);
	}
}
