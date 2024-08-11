package classe;

public class Jantar {

	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa("André", 75);
		
		Comida comida1 = new Comida("Lamen", 0.3);
		
		String cliente = String.format("O cliente %s comeu um %s%n", pessoa1.nome, comida1.nome);
		String antesDeComerPeso = String.format("Seu peso antes de comer era %.2f", pessoa1.peso);
		System.out.println(cliente + antesDeComerPeso);
		
		pessoa1.comer(comida1);
		pessoa1.comer(comida1);
		
		String depoisDeComerPeso = String.format("Seu peso depois de comer era %.2f", pessoa1.peso);
		System.out.println(depoisDeComerPeso);
		
	}
}
