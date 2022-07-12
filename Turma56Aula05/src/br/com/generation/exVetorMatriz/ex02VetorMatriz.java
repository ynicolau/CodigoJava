package br.com.generation.exVetorMatriz;

import java.util.Random;

public class ex02VetorMatriz {
	
	/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();
		int maior = 0, soma = 0, maiorP = 0; 
		
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(1,6);
			
			System.out.println("O lançamento é igual a: " + vetor[i]);
			
			if(vetor[i] > maior) {
				
			maior = vetor[i];
				
			}
			
			soma += vetor[i];
			
	}
		
		for(int i = 0; i < vetor.length; i++) {
		  
			if(maior == vetor[i]) {
				maiorP++;
				
				
			}
		}
		
		System.out.println("A média de todos os lançamentos é igual: " + soma/10);
		System.out.println("A quantidade de vezes que o maior numero aparece é: " + maiorP );
		
	}
}
