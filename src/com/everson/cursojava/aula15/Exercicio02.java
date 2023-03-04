package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um números: ");
		int numero = scan.nextInt();
				
		if (numero < 0) {
			System.out.println("É negativo");
		} else {
			System.out.println("É positivo");
		}
		scan.close();
	}

}
