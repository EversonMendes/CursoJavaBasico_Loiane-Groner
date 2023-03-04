package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/** Exercises 14 e 15 */
		/**
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O " + numero1 + " é maior");
		} else {
			System.out.println("O " + numero2 + " é maior");
		}
		scan.close();
	}

}
