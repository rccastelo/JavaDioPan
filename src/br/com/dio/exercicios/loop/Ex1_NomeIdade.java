package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeIdade {
	
	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner scn = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("\n\nDigite o nome do aluno: ");
			nome = scn.next();
			
			if(nome.equalsIgnoreCase("0")) break;
			
			System.out.println("\nDigite a idade do aluno: ");
			idade = scn.nextInt();
			
			System.out.println("\nAluno Nome [" + nome + "] Idade [" + idade + "]");
		}
		
		scn.close();
		
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}
}
