package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;

		double b = a; // atribuição por valor (Tipo Primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, 1, 2000);
		Data d2 = d1; // atribuição por referencia (Objeto)

		d1.dia = 31;
		d2.mes = 12;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d2);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
