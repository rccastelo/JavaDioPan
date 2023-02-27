package br.com.dio.model;

public class Usuario {
	
	private long id;
	private String apelido;
	private String senha;
	private boolean situacao = true;
	
	public Usuario() { }

	public Usuario(long id, String apelido, String senha, boolean situacao) {
		this.id = id;
		this.apelido = apelido;
		this.senha = senha;
		this.situacao = situacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Usuario id [" + id + "] apelido [" + apelido + "] situacao [" + situacao + "]";
	}
	
}
