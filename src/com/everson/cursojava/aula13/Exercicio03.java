package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio03 {
	
	//Faça um programa que peça 2 números e então mostre na tela a soma deles

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		System.out.println("Digite 2 números: ");
		
		int numero1 = n1.nextInt();
		int numero2 = n2.nextInt();
		System.out.println("A soma dos dois é: " + (numero1 + numero2));
		n1.close();
		n2.close();
	}
	
}
