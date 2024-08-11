package classe;

public class DataPrincipal {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		data.ano = 2020;
		
		System.out.println("Hoje é dia " + data.dia);
		System.out.println("Hoje é mes " + data.mes);
		System.out.println("Hoje é ano " + data.ano);
		
		var data2 = new Data(03, 8, 1999);
		
		String retornaData = data.obterDataFormatada();
		System.out.printf(retornaData, data2.dia, data2.mes, data2.ano);
		
		System.out.println();
	}
}
