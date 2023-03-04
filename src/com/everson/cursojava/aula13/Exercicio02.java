package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio02 {
	
	//Faça um programa que peça um número e então mostre a mensagem "O numero informado foi:" 

	public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero = numero1.nextInt();
		
		System.out.println("O número digitado foi: " + numero);
		numero1.close();
	}
	
}
