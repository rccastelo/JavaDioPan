package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		String texto;
		double numero;
		double total = 0;
		double maior = 0;
		int contador = 0;
		Scanner scn = new Scanner(System.in);
		
		while (contador < 5)
		{
			System.out.println("\n\nDigite o " + (contador+1) + "º número: ");
			texto = scn.next();
			
			try {
				numero = Double.parseDouble(texto);
				
				if (numero > maior) maior = numero;
				
				total += numero;
				
				contador++;
			} catch (Exception e) {
				System.out.println("\nDigite um número válido!");
			}
		}
		
		scn.close();
		
		System.out.println("\nMaior número [" + maior + "]");
		System.out.println("\nMédia [" + (total / 5) + "]");
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
