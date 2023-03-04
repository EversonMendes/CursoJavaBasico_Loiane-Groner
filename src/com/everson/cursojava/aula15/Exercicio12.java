package com.everson.cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();

		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;
		double percentualSindicato = 3;
		double percentualIR = 0;
		double percentualINSS = 10;
		double percentualFGTS = 11;

		if (salarioBruto <= 900) {
			percentualIR = 0;

		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		double sindicato = (salarioBruto / 100) * percentualSindicato;
		double inss = (salarioBruto / 100) * percentualINSS;
		double fgts = (salarioBruto / 100) * percentualFGTS;
		double ir = (salarioBruto / 100) * percentualIR;
		double descontos = inss + fgts + sindicato;
		double salarioLiquido = salarioBruto - descontos;

		System.out.println("Salário Bruto: (" + valorHora + "*" + horasTrabalhadas + ": R$" + salarioBruto);
		System.out.println("(-) IR: (" + percentualIR + "%):  R$" + ir);
		System.out.println("(-) INSS: (" + percentualINSS + "%): R$" + inss);
		System.out.println("FGTS: (" + percentualFGTS + "%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);

		scan.close();
	}
}
