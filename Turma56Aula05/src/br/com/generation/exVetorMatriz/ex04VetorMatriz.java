package br.com.generation.exVetorMatriz;

import java.util.Scanner;

public class ex04VetorMatriz {
	
	/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int contador = 1;
        double soma = 0.0, diagonal = 0.0;
        double[][] matriz = new double[3][3];

        for(int l = 0; l < matriz.length; l++) {
            for(int c = 0; c <  matriz.length; c++) {

            System.out.println("Digite o " + contador + "° numero:");
            matriz[l][c] = sc.nextDouble();

            contador++;

            }
        }

        for(int l = 0; l < matriz.length; l++) {
            for(int c = 0; c <  matriz.length; c++) {

                soma += matriz[l][c];

            }
        }

        diagonal = matriz[1][1] + matriz[2][2] + matriz[0][0];
        System.out.println();
        System.out.println("O resultado das somas das matrizes é; " + soma);
        System.out.println("O resultado das somas da diagonal é; " + diagonal);

        sc.close();
		
	}

}
