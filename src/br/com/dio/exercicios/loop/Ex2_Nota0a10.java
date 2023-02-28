package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota0a10 {
	
	public static void main(String[] args) {
		String nota;
		int notaNum;
		
		Scanner scn = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("\n\nDigite a nota: ");
			nota = scn.next();
			
			try {
				notaNum = Integer.parseInt(nota);
				
				if (notaNum < 0 | notaNum > 10) {
					System.out.println("\nA nota deve estar entre 0 e 10.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\nDigite uma nota válida!");
			}
		}
		
		scn.close();
		
		System.out.println("\nNota informada [" + notaNum + "]");
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}
	
}
