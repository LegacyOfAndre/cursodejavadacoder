package basicjavaproject;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 25;
		short numerosDeVoos = 500;
		int id = 877734;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_345.89F;
		double vendasAcumuladas = 2_991_797_103.03;

		//Tipo Booleano
		boolean estaDeFerias = true;
		
		//Tipo Caractere
		char sinal = 'A';
		
		//Dias de empresa 
		System.out.println("Total de dias de empresa: " + anosDeEmpresa * 365);
		
		System.out.println("Total de voos do funcionário: " + numerosDeVoos / 2);
		
		System.out.println("Total de pontos do funcionario: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("Funcionario de id:" + id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + sinal);
	}

}
