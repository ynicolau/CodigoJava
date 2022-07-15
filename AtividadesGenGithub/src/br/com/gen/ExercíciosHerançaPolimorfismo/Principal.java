package br.com.gen.ExercíciosHerançaPolimorfismo;

public class Principal {
	
	public class Principal {

	    public static void main(String[] args) {

	        TestaAnimal test = new TestaAnimal();

	        Cachorro cachorro = new Cachorro();
	        Cavalo cavalo = new Cavalo();
	        Preguica preguica = new Preguica();

	        test.fazerAnimalBarulho(cachorro);
	        test.fazerAnimalBarulho(cavalo);
	        test.fazerAnimalBarulho(preguica);

	    }
	}
}
	    
