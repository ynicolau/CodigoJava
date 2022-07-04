programa {
    
    // exercicio 4
		/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
			em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
			diagonal, ou seja, diagonal principal.
		*/
    
	funcao inicio() 
	{
	
	inteiro matriz[3][3]
		inteiro somaTotal = 0
		inteiro somaDiagonalPrincipal = 0

		para(inteiro l = 0; l <=2; l++ ){
			para(inteiro c = 0; c <= 2; c++){
				escreva("Digite um numero da matriz["+ l +"]["+ c +"]: ")
				leia(matriz[l][c])
			}
		}

		para(inteiro l = 0; l <=2; l++ ){
			para(inteiro c = 0; c <= 2; c++){
				somaTotal += matriz[l][c]
				se(c == l){
					somaDiagonalPrincipal += matriz[l][c]
				}
			}
		}

		escreva("Soma dos elementos da matriz: " + somaTotal + "\n")
		escreva("Soma da Diagonal Principal: " + somaDiagonalPrincipal)
		
		
	}
}
