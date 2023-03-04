package com.everson.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Everson";
		String nomeDoMeuCachorro = "Dipsy";
		String ano2014 = "2014";
		
		// aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String NomeDoMeuCachorro;
		String nome_do_meu_cachorro;
				
		idade = 25;
System.out.println("Idade: " + idade);
System.out.println("Nome: " + nome);

		//má prática - Sempre deixar claro o que é cada variável.
		int a = 20;
		String b = "Everson";
		String c = "Dipsy";
		String d = "2014";

	}

}
