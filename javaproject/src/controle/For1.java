package controle;

public class For1 {

	public static void main(String[] args) {

//		int contador = 1;
//
//		while (contador <= 5) {
//			System.out.printf("i = %d\n", contador);
//			contador++;
//		}

		for (int contador = 0; contador <= 20; contador++) {
			System.out.printf("i = %d\n", contador);
		}

		// Estrutura mais bagunçada do for
		int x = 2;
		for(;x < 10;) {
			System.out.printf("x = %d\n", x);
			x++;
		}
		
		//Laço infinito
		for(;true;) {
			System.out.println("Fim");
		}
	}
}
