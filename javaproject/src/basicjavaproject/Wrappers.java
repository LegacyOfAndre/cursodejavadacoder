package basicjavaproject;

public class Wrappers {

	public static void main(String[] args) {

		Byte b = 100;

		Short s = 1000;

		Integer i = 10000; // int

		Long lo = 100000L;

		System.out.println(b);
		System.out.println(s.toString());
		
		System.out.println(i);
		System.out.println(lo);

		Float f = 324.5F;
		System.out.println(f);
		
		Double d = 323332.133;
		System.out.println(d);
		
		
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
	}
}
