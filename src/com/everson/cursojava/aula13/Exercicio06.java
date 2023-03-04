 package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio06 {
	
	//Faça um programa que peça o raio de um circulo, calcule e mostre sua área

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		
		System.out.println("Digite o raio do círculo: ");
		
		double raio = r.nextDouble();
		//double pi = 3.14;
		double area = /*(raio*raio)**/ Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area + "cm");
		r.close();
		
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13