package com.everson.cursojava.aula13;

import java.util.Scanner;

public class Exercicio15 {

	/* Faça um programa que pergunte quanto você ganha por hora e o 
	 * numero de horas trabalhadas no mês calcule e mostre o total 
	 * do seu salario no referido mês*/

	public static void main(String[] args) {
		Scanner vh = new Scanner(System.in);
		Scanner htm = new Scanner(System.in);

		System.out.println("Qual valor da sua hora de trabalho? ");

		int valorHora = vh.nextInt();

		System.out.println("Qual valor da sua hora de trabalho? ");
		double horasTrabalhadasMês = htm.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadasMês;
		double INSS = (salarioBruto * 8) / 100;
		double IR = (salarioBruto * 11) / 100;
		double sindicato = (salarioBruto * 5) / 100;
		double salarioLiquido = salarioBruto - (INSS + IR +sindicato);
		
		System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
		System.out.println("Desconto de INSS: " + "R$" + INSS);
		System.out.println("Desconto sindicato: " + "R$" + sindicato);
		System.out.println("O seu salário liquido é: " + "R$" + salarioLiquido);
		
		vh.close();
		htm.close();
	}

}
//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13