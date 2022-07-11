package br.com.generation.lacosDecisao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class lacosDeDecisaoex02 {
	
	public static void main(String[] args) {
		Scanner crescente = new Scanner(System.in);
		int numero1, numero2, numero3, auxiliar;
		
		// TODO Auto-generated method stub
		
		System.out.println("Digite o primeiro numero: " );
		numero1 = crescente.nextInt();
		
		System.out.println("Digite o segundo numero: " );
		numero2 = crescente.nextInt();
		
		System.out.println("Digite o terceiro numero: " );
		numero3 = crescente.nextInt();
		
		if(numero1> numero2){ 
			
		    auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		  
			
		
			
		}else if(numero2 > numero3) {
			auxiliar = numero2;
			numero2 = numero3;
			numero3 = auxiliar;
			
		}else {
			auxiliar = numero3;
			numero3 = numero1;
			numero1 = auxiliar;
			
		}
		System.out.println("Ordem crescente: " );
		System.out.println(numero1 + " " + numero2 + " " + numero3 + " ");
		
	}

}
