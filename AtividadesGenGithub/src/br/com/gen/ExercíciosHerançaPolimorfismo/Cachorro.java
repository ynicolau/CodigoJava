package br.com.gen.ExercíciosHerançaPolimorfismo;

public class Cachorro extends Animal{


    @Override
    public void correr() {
        System.out.println("Cachorro correr");
    }

    @Override
    public void emitir() {
        System.out.println("Cachorro emitindo som...");

    }
}
