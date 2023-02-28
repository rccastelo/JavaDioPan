package br.com.dio.exercicios.array;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class Ex4_Multidimensional {

	public static void main(String[] args) {
		int [][] vetor = new int[4][4];
		Random random = new Random(); 
		
		for (int i=0;i<vetor.length;i++) {
			for (int j=0;j<vetor[i].length;j++) {
				vetor[i][j] = random.nextInt(9);
			}
		}

		System.out.println("Matriz: ");
		
		for (int [] linha : vetor) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

		System.out.println("\nObrigado por utilizar nossos sistemas.");
	}

}
