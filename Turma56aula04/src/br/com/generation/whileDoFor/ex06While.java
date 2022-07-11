package br.com.generation.whileDoFor;

import java.util.Scanner;

public class ex06While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double media;
		double soma = 0.0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero inteiro ou zero para sair: ");
			numero = entrada.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		}while(numero != 0);
		
		media = soma/contador;
		System.out.println("\nA média dos números mútiplos de 3: " + media);
		
		entrada.close();
		
	}

}
