package br.com.dio.exercicios.array;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {

	public static void main(String[] args) {
		int consoantes = 0;
		String [] vetor = new String[6];
		Scanner scn = new Scanner(System.in); 
		
		for (int i=0;i<6;i++) {
			System.out.println("Digite uma letra: ");
			String texto = scn.next();
			
			if (!(texto.equalsIgnoreCase("a") | 
					texto.equalsIgnoreCase("e") |
					texto.equalsIgnoreCase("i") |
					texto.equalsIgnoreCase("o") |
					texto.equalsIgnoreCase("u"))) {
				vetor[i] = texto;
				consoantes++;
			}
		}
		
		if (consoantes > 0) {
			System.out.print("Consoantes: ");
			
			for (int i=0;i<vetor.length;i++) {
				if (vetor[i] != null)
			System.out.print(vetor[i] + " ");
			}
		} else {
			System.out.println("\nNenhuma consoante digitada!");
		}
		
		scn.close();
		
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
