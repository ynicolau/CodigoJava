package br.com.generation.Metodos;

public class GeradorCliente {

	public static void main(String[] args) {
		
		//	Instanciando o objeto do ClassCliente
		
		ClasseCliente cliente = new ClasseCliente();
		
		
     //cadastro
		cliente.setnome("Artur");
		cliente.setSobrenome("Santos");
		cliente.setIdade(1);
		
		
		//busca
		System.out.println(cliente.getNome());
		System.out.println(cliente.getSobrenome());
		System.out.println(cliente.getIdade());
		cliente.cadastrado();
		
		
	}

}
