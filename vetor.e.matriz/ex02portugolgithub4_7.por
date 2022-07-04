programa {
    inclua biblioteca Util
	funcao inicio()
	
	{
	    
	  // exercicio 2
		//  Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		//  que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		//  a média aritmética dos lançamentos, contabilize e apresente também
		// quantas foram as ocorrências da maior pontuação.  
	    
	    
	    
	 real maior = 0
		real soma = 0
		real media
		inteiro valorDado[10]
		inteiro dSeis = 6
		inteiro maiorOcorrencia = 0
		inteiro numeroLancamentos = 10

		para(inteiro i = 0; i <= numeroLancamentos - 1; i++){
			valorDado[i] = Util.sorteia(1, dSeis)

		}

		para(inteiro i = 0; i <= numeroLancamentos - 1; i++){


			soma += valorDado[i]

			se(valorDado[i] == maior){
				maiorOcorrencia++
			}
			
			se(valorDado[i] > maior){
				maior = valorDado[i]
				maiorOcorrencia = 1
			}

			
		}

		media = soma/numeroLancamentos

		escreva("O maior lance foi de: " + maior + " caiu x" + maiorOcorrencia + "\n")
		escreva("A média aritmética dos lances foram: " + media)  
	
	}
}
