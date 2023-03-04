package com.everson.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("Qual o valor do produto? ");

		int preco = scan.nextInt();

		if (preco <= 10) {
			System.out.println("Está barato, pode comprar");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Solicite um desconto");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("Pesquise mais");
		} else {
			System.out.println("Está muito caro");
		}
		scan.close();
	}
}
