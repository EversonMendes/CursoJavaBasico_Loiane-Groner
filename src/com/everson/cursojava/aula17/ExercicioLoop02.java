package com.everson.cursojava.aula17;

import java.util.Scanner;

public class ExercicioLoop02 {

	public static void main(String[] args) {
		// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		Scanner scan = new Scanner(System.in);

		boolean nomeSenhaIguais = false;
		String nome;
		String senha;

		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();

			System.out.println("Digite sua senha: ");
			senha = scan.next();

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Nome e senha não podem ser iguais, digite novamente!");
			} else {

				nomeSenhaIguais = true;
				System.out.println("Nome: " + nome);
				System.out.println("Senha: " + senha);
			}

		} while (!nomeSenhaIguais);

	}

}
