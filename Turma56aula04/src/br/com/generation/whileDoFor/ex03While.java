package br.com.generation.whileDoFor;

import java.util.Scanner;

public class ex03While {
	
	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) 
	 */
	public static void main(String[]args) {
	
	Scanner  leia = new  Scanner (System.in);
	
	 int idade = 0, menor21 = 0,  maior50 = 0;
	

	while (idade != -99) {
		System.out.println( "Digite a sua idade ou -99 para terminar: " );
		idade = leia.nextInt ();
		
		if (idade < 21 && idade >= 0) {
		    menor21++;
		 } 
	    if ( idade > 50) {
	    	maior50++;
	    }
	
	}
	
	System.out.println( "Quantidade de pessoas com menos de 21 anos: " + menor21 );
	System.out.println( "Quantidade de pessoas com mais de 50 anos: " + maior50 );
	
	leia.close();

}

}
