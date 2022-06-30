programa {
	funcao inicio() {
    	inteiro ano
    	inteiro meses
    	inteiro totalDeDias
    	
    	escreva("Digite sua idade em dias: ")
    	leia(totalDeDias)
    	
    	//Convertendo dias em anos
    	
    	ano = totalDeDias / 365 
    	
    	//Convertendo dias em meses
    	
    	meses = (totalDeDias % 365) / 30
    	
    	idadeDeDias = (totalDeDias % 365) / 30
    	
    	escreva("Sua idade é:" + ano + "anos" + meses "meses" + idaDeDias + "dias" )
    	
    	
	}
}
