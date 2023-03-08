package com.everson.cursojava.aula17;

import java.util.Scanner;

public class ExercicioLoop01 {

	public static void main(String[] args) {
		// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Digite sua nota (0-10): ");
			double nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente!");
			}

		} while (!notaValida);

	}

}
