package br.com.generation.exVetorMatriz;

import java.util.Scanner;

public class ex01VetorMatriz {
	
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner leia = new Scanner(System.in);
		
		
		int valor = 0;
		int i ;
		int maiorP = 0;
		int vetor[];
		
		
	vetor = new  int[5];
		
      for(i = 0; i < vetor.length ; i++) {
    	  
   System.out.println("Digite a pontuaçao: " + (i + 1) + "º valor: ");
   vetor[i] = leia.nextInt(); 
   
  
     
     if( vetor[i] > maiorP){
    	 
    	 maiorP = vetor[i];
     }
      }
     for(i = 0; i < vetor.length ; i++) {
    	 
    	System.out.println("No vetor " + (i+1) + " esta armazenado o valor: " + vetor[i]);
     }
    	  
      
      
      System.out.println("A maior pontuaçao é: " + maiorP);
	}

}
