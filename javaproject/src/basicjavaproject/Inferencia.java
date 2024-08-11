package basicjavaproject;

public class Inferencia {

	public static void main(String[] args) {
		
		var a = "";
		a = "Luis";
		System.out.println(a);
		
		var b = 3.4;
		b = 5;
		System.out.println(b);
		
		int c;
		c = 10;
		System.out.println(c);
		
		var d = 13;
		System.out.println(d);
//		d = 13.5; Aqui acontece um erro pois não há inferencia dessa maneira no java.
	}
}
