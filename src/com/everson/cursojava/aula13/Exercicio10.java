package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10 {
	
	//Faça um programa que peça a temperatura em graus Celsius, tranforme e mostre a temperatura em Farenheit
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
				
		System.out.printf("Digite a temperatura em Celsius: ");
		
		double temperaturaC = c.nextDouble();
		
		double temperaturaFh = (temperaturaC * 9/5) + 32;
		
		System.out.println("A temperatura é: " + temperaturaFh  + "F°" );
		c.close();
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13