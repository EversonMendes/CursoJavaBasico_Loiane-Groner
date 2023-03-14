package com.everson.cursojava.aula17;

import java.util.Scanner;

public class ExercicioLoop06 {

	public static void main(String[] args) {
		int numInicial = 0;
		int numFinal = 20;
		while (numFinal > numInicial) {
			numInicial++;
			System.out.print(numInicial + ",");
		}
	}
}
