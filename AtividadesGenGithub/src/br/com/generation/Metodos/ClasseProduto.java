package br.com.generation.Metodos;

/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class ClasseProduto {
	
	private String produto;
	private String marca;
	private Integer quantidade;
	
	
	//funçao receber e devolver
	//gets e sets
	
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	//funçao de açao 
	
	void comprados() {
		System.out.println("Produtos comprados: ");
		

	}
}
