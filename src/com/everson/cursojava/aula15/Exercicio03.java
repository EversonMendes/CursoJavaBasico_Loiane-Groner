package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo(F ou M): ");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
		scan.close();
	}
}
