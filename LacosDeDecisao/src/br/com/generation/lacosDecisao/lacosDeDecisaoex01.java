package br.com.generation.lacosDecisao;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.


public class lacosDeDecisaoex01 {
	
	 public static void main(String[] args) {
		 Scanner saida = new Scanner(System.in);
		 int numero1, numero2, numero3, maior;
		 
		
		// TODO Auto-generated method stub
     
		System.out.println("Digite o primeiro numero: " );
		numero1 = saida.nextInt();
		
		System.out.println("Digite o segundo numero: " );
		numero2 = saida.nextInt();
		
		System.out.println("Digite o terceiro numero: " );
		numero3 = saida.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
		maior = numero1;
		} else if(numero2 > numero3) {
			maior = numero2;
		} else {
			maior = numero3;
		}
		System.out.println("O maior numero é: " + maior);
		
		saida.close();
		}
	}


 