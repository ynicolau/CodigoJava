package br.com.gen.ExercíciosHerançaPolimorfismo;

/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:  */


public abstract class Animal  implements  AnimailEmitir {

    private String nome;
    private Integer idade;


    public abstract void correr();

    @Override
    public void emitir() {
		
	       }


	     }


  