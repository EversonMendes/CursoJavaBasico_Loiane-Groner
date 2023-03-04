package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numero3 = scan.nextInt();

		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O número " + numero1 + " é o maior");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O número " + numero2 + " é o maior");
		} else {
			System.out.println("O número " + numero3 + " é o maior");
		}

		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("O número " + numero1 + " é o menor");
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println("O número " + numero2 + " é o menor");
		} else {
			System.out.println("O número " + numero3 + " é o menor");
		}
		scan.close();
	}
}
