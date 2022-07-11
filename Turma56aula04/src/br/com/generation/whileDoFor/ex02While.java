package br.com.generation.whileDoFor;

import java.util.Scanner;


public class ex02While {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		for( int i = 1, num = 0, par = 0, impar = 0; i <= 10; i++) {
			System.out.println("Insira 1 valor: ");
			num = leia. nextInt();
		if (num % 2 == 0) {
		par++;
		
		System.out.println( num + "Esse é um numero pa: ");
		}
		
		 if (num % 2 == 0) {
			impar++ ;
			
			System.out.println(num + "Esse é um numero impar: ");
		  
			System.out.println(par + "<par| impar>" + impar);
		 }
		
		}}

	}
