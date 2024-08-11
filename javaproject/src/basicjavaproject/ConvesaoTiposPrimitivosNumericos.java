package basicjavaproject;

public class ConvesaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Implícita
		System.out.println(a);
		
		float b = (float) 1.0; // explícita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		Integer f = (int) e;
		System.out.println(f.equals(1));
	}
}
