package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio11 {
	
	//Faça um programa que peça a temperatura em graus Celsius, tranforme e mostre a temperatura em Farenheit
	
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
				
		System.out.printf("Digite 3 números, sendo o último com casas decimais: ");
		
		int inteiro1 = n1.nextInt();
		int inteiro2 = n2.nextInt();
		double real = r.nextDouble();
		
		double a = (inteiro1 * 2) + inteiro2 / 2;
		double b = (inteiro1 * 3) + real;
		double c = Math.pow(real, 3);
		
		
		System.out.println("a) O produto do dobro do primeiro com metade do segundo é: " + a  );
		System.out.println("b) A soma do triplo do primeiro com o terceiro é: " + b  );
		System.out.println("c) O terceiro elevado ao cubo é: " + c  );
		n1.close();
		n2.close();
		r.close();
	}
	
}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13