package br.com.dio;

import br.com.dio.application.Aplicacao;
import br.com.dio.model.TvSmart;

public class JavaDioPan {
	
	public static void main(String[] args) {
		
		Aplicacao aplicacao = new Aplicacao();
		
	}

}

class OutraClasse {
	String classe;
	String metodo;

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	@Override
	public String toString() {
		return "OutraClasse - classe [" + classe + "] metodo [" + metodo + "]";
	}
}
