package br.com.generation.whileDoFor;

import java.util.Scanner;

public class ex05While {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		// TODO Auto-generated method stub
    
		Scanner entrada = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			soma+=numero;
			
		}while(numero != 0);
		
		System.out.println("\nA soma dos numeros digitado é: " + soma);
		
		entrada.close();
	}
   
}
