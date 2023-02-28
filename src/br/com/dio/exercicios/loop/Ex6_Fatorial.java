package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {

	public static void main(String[] args) {
		String texto;
		int fatorial = 1;
		int numero;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("\n\nEscolha um número: ");
		texto = scn.next();

		numero = Integer.parseInt(texto);

		texto = "";
		
		for (int i=numero;i>1;i--) {
			fatorial *= i;
			texto += i + " X ";
		}

		scn.close();
		
		System.out.println("\n" + numero + "!= " + fatorial + " (" + texto + "1)");	
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
