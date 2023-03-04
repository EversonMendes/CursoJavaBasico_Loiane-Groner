package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio14 {

	/* Faça um programa que peça armazene o peso, caso for acima de 50kg 
	 * armazenar o excesso em uma variável e calcular o valor da multa 
	 * sobre o excesso (R$4 por kilo).*/
	
	public static void main(String[] args) {
		System.out.printf("Digite o peso: ");
		Scanner p = new Scanner(System.in);
		double peso = p.nextDouble();
		double excesso = 0;
		double valorMulta = 0;
		double multa = 4;

		if (peso > 50) {
			excesso = peso - 50;
			valorMulta = excesso * multa;
			System.out.println("Peso excedente: " + excesso + " kg");
			System.out.println("Valor da multa: " + valorMulta +" reais");
		}else {
			System.out.println("Parabéns, você não excedeu o peso");
			System.out.println("Peso excedente: " + excesso +" kg");
			System.out.println("Valor da multa: " + valorMulta+ " reais");
			
		}
		p.close();
	}
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13