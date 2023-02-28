package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParImpar {

	public static void main(String[] args) {
		String texto;
		int quantidade;
		int par = 0;
		int impar = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("\n\nDigite a quantidade de números: ");
		texto = scn.next();
		
		quantidade = Integer.parseInt(texto);
			
		for (int i=0;i<quantidade;i++)
		{
			System.out.println("\n\nDigite o " + (i+1) + "º número: ");
			texto = scn.next();
			
			int numero = Integer.parseInt(texto);
			
			if ((numero % 2) == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("\nPares [" + par + "] Ímpares [" + impar + "]");
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
