package br.com.generation.Metodos;

public class ClasseCliente {

	private String nome;
	private String sobrenome;
	private Integer idade;
	
	//Vai receber o valor
	public void setnome(String nome) {
		this.nome = nome;
	}
	//Devolve o valor
		public String getNome() {
			return nome;
			
		}
		//sobrenome
		
		public String getSobrenome() {
			return sobrenome;
		}
		
			public void setSobrenome(String sobrenome) {
				this.sobrenome = sobrenome;
		    }
		
		
		
		
		//Idade
	public void setIdade(Integer idade) { 
		this.idade = idade;  }
	
	public Integer getIdade() {
		return idade;
	}
	
	//metodo
	public static void cadastrado() {
		System.out.println("Cadastrado...");
		
	}
	
}
