package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio04 {
	
	//Faça um programa que peça a nota dos 4 bimestres e mostre a média

	public static void main(String[] args) {
		Scanner b1 = new Scanner(System.in);
		Scanner b2 = new Scanner(System.in);
		Scanner b3 = new Scanner(System.in);
		Scanner b4 = new Scanner(System.in);
		
		System.out.println("Digite sua nota do 1° bimestre: ");
		
		double nota1 = b1.nextDouble();
		
		System.out.println("Digite sua nota do 2° bimestre: ");
		double nota2 = b2.nextDouble();
		
		System.out.println("Digite sua nota do 3° bimestre: ");
		double nota3 = b3.nextDouble();
		
		System.out.println("Digite sua nota do 4° bimestre: ");
		double nota4 = b4.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A sua média é: " + media);
		b1.close();
		b2.close();
		b3.close();
		b4.close();
	}
	
}
