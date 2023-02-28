package br.com.dio.exercicios.array;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		int [] vetor = new int[20];
		Random random = new Random(); 
		
		for (int i=0;i<20;i++) {
			vetor[i] = random.nextInt(100);
		}
		
		System.out.println("Números aleatórios...");
		
		for (int i=0;i<vetor.length;i++) {
			System.out.println((i+1) + " )  " + (vetor[i] - 1) + " [ " + vetor[i] + " ] " + (vetor[i] + 1));
		}
		
		System.out.println("\nObrigado por utilizar nossos sistemas.");
	}

}
