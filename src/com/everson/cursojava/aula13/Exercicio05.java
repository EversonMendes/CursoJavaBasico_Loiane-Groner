package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio05 {
	
	//Faça um programa que converta metros em centímetros

	public static void main(String[] args) {
		Scanner metragem = new Scanner(System.in);
		
		
		System.out.println("Digite a metragem para conversão em centímetros: ");
		
		double metros = metragem.nextDouble();
		
		double centimetro = metros*100;
		
		System.out.println("O resultado em centímetros é: " + centimetro + "cm");
		metragem.close();
		
	}
	
}
