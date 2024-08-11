package classe;

public class ProdutoTreste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Vassoura", 19.60, Produto.desconto);
		
		var p2 = new Produto("Rodinho", 15, Produto.desconto);

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		System.out.printf("Desconto do produto (%s): %.2f%bn", p1.nome, precoFinal1);
		
		double precoFinal2 = p2.precoComDesconto();
		System.out.println((precoFinal1 + precoFinal2) / 2 + "R$");
	
	}
}
