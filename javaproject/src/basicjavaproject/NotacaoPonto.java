package basicjavaproject;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String a = "Boa noite X";
		a = a.replace("X", "andre");
		a = a.toUpperCase();
		a = a.concat("!!!"); 
		
		System.out.println(a);
	}
	
}
