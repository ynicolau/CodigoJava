programa {
   // Fa�a um sistema que leia a idade o tempo de dura�ao de um evento em fabrica expressa em segundos e mostre-o expresso em horas,minutos e segundos.
   
	funcao inicio() {
	
	inteiro horas
	inteiro minutos
	inteiro segundos
	
	escreva("Quantos segundos teve o evento?: ")
	leia(segundos)
	
	//converter minutos em horas
	 
	 horas = (segundos / 3600)
	
	//converter segundos em minutos
	
   minutos = (segundos-(horas*3600)) / 60 
   
   
   segundos = (segundos - (horas*3600) - (minutos*60))
   
   escreva(" horas ", horas , " minutos ", minutos , " e segundos ", segundos)
   
   
   
   
	
	
	
	
	
		
	}
}
