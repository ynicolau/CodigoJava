programa {
	funcao inicio() {
	
	real custoFabrica
	real porcentDistribuidor = 1.28
	real imposto = 1.45
	real custoConsumidor 
	
	escreva("Insira custo fabrica: ")
	leia(custoFabrica)
	
	custoConsumidor = custoFabrica * porcentDistribuidor * imposto
	
	escreva("Resultado: ", custoConsumidor)
	
	
	
	}
}
