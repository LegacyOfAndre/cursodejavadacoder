package basicjavaproject.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
//		c = c + b;
		c += b; //c = c + b;
		c -= a; //c = c - b;
		c *= a; //c = c * b;
		c /= a; //c = c / b;
		
		c %= a; //c = c % 2; 0 ou 1
		System.out.println(c);
	}
}
