package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio09 {
	
	//Faça um programa que peça a temperatura em graus Farenheit, tranforme e mostre a temperatura em Celsius
	
	public static void main(String[] args) {
		Scanner fh = new Scanner(System.in);
				
		System.out.printf("Digite a temperatura em Farenheit: ");
		
		double temperaturaFh = fh.nextDouble();
		
		double temperaturaC = (5* (temperaturaFh - 32) /9);
		
		System.out.println("A temperatura é: " + temperaturaC  + "C°" );
		fh.close();
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13