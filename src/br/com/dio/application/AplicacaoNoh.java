package br.com.dio.application;

import br.com.dio.exercicios.noh.Noh;

public class AplicacaoNoh {

	public static void main(String[] args) {
		Noh<String> noh1 = new Noh("noh um");

		Noh<String> noh2 = new Noh("noh dois");
		noh1.setProximoNoh(noh2);
		
		Noh<String> noh3 = new Noh("noh tres");
		noh2.setProximoNoh(noh3);
		
		Noh<String> noh4 = new Noh("noh quatro");
		noh3.setProximoNoh(noh4);
		
		System.out.println(noh1);
		System.out.println(noh1.getConteudo());
		System.out.println(noh2);
		System.out.println(noh2.getConteudo());
		System.out.println(noh2.getProximoNoh());
		System.out.println(noh2.getProximoNoh().getConteudo());
		System.out.println(noh2.getProximoNoh().getProximoNoh());
		System.out.println(noh2.getProximoNoh().getProximoNoh().getConteudo());
	}

}
