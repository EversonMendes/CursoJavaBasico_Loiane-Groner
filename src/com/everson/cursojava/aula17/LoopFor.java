package com.everson.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		// Exemplo de for "normal"
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor de i: " + i);
		}

		System.out.println("***************************************");
		// Exemplo de for com mais de uma variável
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

		// Exemplo de for com partes ausentes
		int count = 0;
		for (; count < 5;) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}

		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de count: " + cont);
		}

		// Exemplo de loop sem corpo (não é o padrão)
		int soma = 0;
		for (int i = 0; i < 5; soma += i++);
		System.out.println("Valor de soma é: " + soma);

	}
}
