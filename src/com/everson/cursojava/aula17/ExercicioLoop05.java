package com.everson.cursojava.aula17;

import java.util.Scanner;

public class ExercicioLoop05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean validaDado = false;
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		int anos = 0;

		do {
			System.out.println("Digite a população A: ");
			populacaoA = scan.nextInt();

			if (populacaoA > 0) {
				validaDado = true;
			} else {
				System.out.println("A população deve ser maior do que 0");
			}
		} while (!validaDado);

		validaDado = false;
		do {
			System.out.println("Digite a população B: ");
			populacaoB = scan.nextInt();

			if (populacaoB > 0 && populacaoB > populacaoA) {
				validaDado = true;
			} else {
				System.out.println("A população B deve ser maior do que 0 e maior que a população A");
			}
		} while (!validaDado);
		
		validaDado = false;
		do {
			System.out.println("Digite a taxa de A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				validaDado = true;
			} else
				System.out.println("A taxa deve ser maior do que 0");

		} while (!validaDado);
		
		validaDado = false;
		do {
			System.out.println("Digite a taxa B: ");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				validaDado = true;
			} else
				System.out.println("A taxa deve ser maior do que 0");

		} while (!validaDado);

		while (populacaoA < populacaoB) {
			populacaoA += populacaoA * (taxaA / 100);
			populacaoB += populacaoB * (taxaB / 100);
			anos++;
		}
		System.out.println("A população de A: " + populacaoA);
		System.out.println("A população de B: " + populacaoB);
		System.out.println("Anos: " + anos);
	}

}
