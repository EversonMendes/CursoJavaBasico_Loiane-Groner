package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio07 {
	
	//Faça um programa que calcule a área de um quadrado e mostre o dobro desta área para o usuário

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		
		System.out.println("Digite o raio do quadrado: ");
		
		int raioQuadrado = r.nextInt();
		double area = Math.pow(raioQuadrado, 2);
		
		System.out.println("O dobro área do quadrado é: " + (area * 2) + "cm");
		r.close();
		
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13