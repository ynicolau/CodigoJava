package br.com.generation.whileDoFor;

import java.util.Scanner;

public class ex04While {
	
	/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
   int idade, sexo, opcao, total = 0, i = 0, calma = 0, pessoa = 0;
   int totalDeCalmos = 0, totalNervosos = 0, totalAgressivos = 0, outros = 0, pessoas = 0;
   
   Scanner entrada = new Scanner(System.in);
    
   while(i <= 2) {
	   System.out.println("Digite a sua idade: " );
	   idade = entrada.nextInt();
	   
	   System.out.println("Digite o seu sexo: " );
	   System.out.println("1 = feminino \n2 = masculino \n3 = outros  " );
	   sexo = entrada.nextInt();
	   
	   System.out.println("Forme suas características psicológica: ");
	   System.out.println("1 = pessoa calma " );
	   System.out.println("2 = Pessoa nervosa: ");
	   System.out.println("3 = pessoa agressiva " );
	   opcao = entrada.nextInt();
	   i++;
	   
	   if(opcao == 1) { 
		   totalDeCalmos = totalDeCalmos + 1;
			if(sexo == 3) { 
			outros = outros + 1;
			} if(idade < 18 ) {
				calma = calma + 1;
			}
	     }
	   if(opcao == 2) {
		   if(sexo == 1){ 
			   totalNervosos = totalNervosos + 1;
		   }
		   if(idade >= 40) {
			   pessoa = pessoa + 1;
		   }
	   }
	   if(opcao == 3) {
		   if(sexo == 2) {
			   totalAgressivos = totalAgressivos + 1;
		   }
	   }
   	}
	System.out.println("Numero de pessoas calmas " + totalDeCalmos);
	System.out.println("Mulheres nervosas: " + totalNervosos);
	System.out.println("Homens agressivos: " + totalAgressivos);
	System.out.println("Outros calmos: " + outros);
	System.out.println("Pessoas com mais de 40 nervosos: " + pessoa);
	System.out.println("Pessoas com menos de 18 calmas: " + calma);
	}
	

}
