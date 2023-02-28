package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {

	public static void main(String[] args) {
		String texto;
		int tabuada = 0;
		Scanner scn = new Scanner(System.in);
		
		while (tabuada < 1 | tabuada > 10) {
			System.out.println("\n\nEscolha um número de 1 a 10: ");
			texto = scn.next();

			tabuada = Integer.parseInt(texto);
		}

		for (int i=1;i<11;i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));	
		}

		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
