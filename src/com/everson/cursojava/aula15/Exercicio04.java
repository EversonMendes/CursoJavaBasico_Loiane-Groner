package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo(F ou M): ");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
				break;
			}
			scan.close();
		}
	}
}
