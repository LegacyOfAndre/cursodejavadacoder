package basicjavaproject;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá, Mundo".charAt(5));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Andre";
		var sobrenome = "Luis";
		var idade = 24;
		var salario = 2000;
		
		System.out.println("Nome:" + nome + " Sobrenome:" + sobrenome +
				" Idade:" + idade + " Salario:" + salario);
		
	}
}
