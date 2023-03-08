package com.everson.cursojava.aula17;

import java.util.Scanner;

public class ExercicioLoop03 {

	public static void main(String[] args) {
		// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {

				System.out.println("Nome precisa ter no mínimo 3 caracteres");

			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {

				System.out.println("Idade precisa ser entre 0 e 150");

			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu salário: ");
			salario = scan.nextInt();

			if (salario > 0) {
				infoValida = true;
			} else {

				System.out.println("Salário precisa ser maior que 0");

			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {

				System.out.println("Opção inválida, você precisa digita F ou M");

			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu estado civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {

				System.out.println("Opção inválida, você precisa digita S ou C ou V ou M");

			}

		} while (!infoValida);
	}

}
