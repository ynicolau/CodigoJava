programa {
	funcao inicio() {
		real salario = 0
		real soma_salario = 0
		real media_salario = 0
		real maior_salario = 0
		real percent_pessoas = 0

        inteiro filhos = 0
        inteiro soma_filhos = 0
        real media_filhos = 0

		inteiro eu

		para (i = 0 ; i < 5 ; i++)
		{
		    escreva ( "Insira valor salario: " )
		    leia (sal�rio)
		    soma_salario = soma_salario + salario

		    se (sal�rio > maior_sal�rio) {
		        maior_salario = salario
		    }

		    se (sal�rio <= 100 ){
		        percent_pessoas++
		    }

		    escreva ( "Insira quantidade de filhos: " )
		    leia (filhos)
            soma_filhos = soma_filhos + filhos
		}

		media_salario = soma_salario /i
		media_filhos = soma_filhos /i
		percent_pessoas = (percent_pessoas * 100 ) /i

		escreva ( "\nMedia salario: " , media_salario)
		escreva ( "\nMedia filhos: " , media_filhos)
		escreva ( "\nMaior Salario: " , maior_salario)
		escreva ( "\n% de pessoas com salario <= 100: " , percent_pessoas)

	}
}
