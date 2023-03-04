package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio13 {

	// Faça um programa que peça a temperatura em graus Celsius, tranforme e mostre
	// a temperatura em Farenheit

	public static void main(String[] args) {
		Scanner alt = new Scanner(System.in);
		Scanner sex = new Scanner(System.in);

		System.out.printf("Digite sua altura: ");

		double altura = alt.nextDouble();

		System.out.printf("Digite seu sexo (1 para Masculino, 2 para Feminino): ");

		int sexo = sex.nextInt();

		double pesoIdealMasculino = (72.7 * altura) - 58;
		double pesoIdealFeminino = (62.1 * altura) - 44.7;

		if (sexo == 1) {
			System.out.println("Seu peso ideal é: " + pesoIdealMasculino + "kg");
		} else if (sexo == 2) {
			System.out.println("Seu peso ideal é: " + pesoIdealFeminino + "kg");
		} else {
			System.out.println("Digite um numero valido");
		}

		Scanner p = new Scanner(System.in);
		System.out.printf("Digite seu peso: ");

		double peso = p.nextDouble();
		double imc = peso / (altura * altura);
		if (imc >= 25) {
			System.out.println("Você está acima do peso");
		} else if (imc < 18.5) {
			System.out.println("Você está abaixo do peso");
		}else {
			System.out.println("Você está dentro do peso normal");
		}
		alt.close();
		sex.close();
		p.close();

	}

}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13