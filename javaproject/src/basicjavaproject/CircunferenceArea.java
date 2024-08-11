package basicjavaproject;

public class CircunferenceArea {

	public static void main(String[] args) {
		
		double raio = 3.8;
		double raioDois = 5.5;
//		System.out.println(raio + (raioDois * 3));
		
		final double PI = 3.1415;
		
		double area = PI * raio * raioDois;
		System.out.println(area);
		
		raio = 10;
		raioDois = 5;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2.");
	}
}
