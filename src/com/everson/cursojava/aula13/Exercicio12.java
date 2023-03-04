package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio12 {
	
	//Faça um programa que peça a temperatura em graus Celsius, tranforme e mostre a temperatura em Farenheit
	
	public static void main(String[] args) {
		Scanner alt = new Scanner(System.in);
						
		System.out.printf("Sua altura: ");
		
		double altura = alt.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
				
		
		System.out.println("Seu peso ideal é: " + pesoIdeal +"kg"  );
		
		alt.close();
		
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13