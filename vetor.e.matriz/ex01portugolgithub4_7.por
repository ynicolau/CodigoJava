programa {
    
    
	funcao inicio() {
	 inteiro pontuacao[5] , maiorValor = 0
	 
	 
	 
	 para(inteiro p = 0; p<= 4; p++ ){
	     
	     escreva("Digite a Pontua��o: " )
	     leia(pontuacao[p])
	     
	     
}	para(inteiro p = 0; p<= 4; p++){
	     escreva(pontuacao[p], "/ " )
	     se(pontuacao[p] > maiorValor){
	         maiorValor = pontuacao[p]
	       }
	     
	     }
	       escreva("\nA maior Pontua��o foi: ", maiorValor)  
	     
	     
	     
	   
	 
	 
	}
}
