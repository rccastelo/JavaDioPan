package br.com.dio.exercicios.array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int [] nums = { 1,3,6,8,12,5 };

		int qtd = nums.length;

		if (qtd > 0) {

			qtd--;

			System.out.println("\n\nOrdem inicial: ");

			for (int i=0;i<=qtd;i++) {
				System.out.println(nums[i] + " ");
			}
			
			System.out.println("\n\nOrdem Inversa: ");
			
			for (int i=qtd;i>=0;i--) {
				System.out.println(nums[i] + " ");
			}
		}
		
		System.out.println("\n\nObrigado por utilizar nossos sistemas.");
	}

}
