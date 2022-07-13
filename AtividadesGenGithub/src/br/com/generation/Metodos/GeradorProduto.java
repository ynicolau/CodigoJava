package br.com.generation.Metodos;

public class GeradorProduto {

	public static void main(String[] args) {
		
		
		ClasseProduto produto = new ClasseProduto();
		
		//informando valor
		produto.setProduto("Detergente");
		produto.setMarca("Limpol");
		produto.setQuantidade(700);
		
		// saida expondo no console 
		
		produto.comprados();
		System.out.println(produto.getProduto());
		System.out.println(produto.getMarca());
		System.out.println(produto.getQuantidade());
		
				
		
		
		

	}

}
