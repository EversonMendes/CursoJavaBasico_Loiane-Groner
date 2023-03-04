package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/** Exercises 14 e 15 */
		/**
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		int resto = 0;

		if (numero % 2 == resto) {
			System.out.println("Este número é par");
		} else {
			System.out.println("Este número é impar");
		}
		scan.close();
	}

}
