package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo(F ou M): ");
		String turno = scan.next();

		switch (turno) {
		case "m":
		case "M":
			System.out.println("Bom dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;
		}

		scan.close();
	}
}
