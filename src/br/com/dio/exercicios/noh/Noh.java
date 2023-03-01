package br.com.dio.exercicios.noh;

public class Noh<T> {

	private T conteudo;
	private Noh<T> proximoNoh;
	
	public Noh(T conteudo) {
		this.proximoNoh = null;
		this.conteudo = conteudo;
	}
	
	public T getConteudo() {
		return this.conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public Noh<T> getProximoNoh() {
		return this.proximoNoh;
	}
	
	public void setProximoNoh(Noh<T> proximoNoh) {
		this.proximoNoh = proximoNoh;
	}
	
	@Override
	public String toString() {
		return "Noh conteudo[" + this.conteudo + "]";
	}
	
}
