package br.com.dio.model;

public class GeladeiraSmart {
	
	private String fabricante;
	private String modelo;
	private String id;
	private boolean ligada = false;
	private boolean frostFree = false;
	private boolean duplex = false;
	private int temperaturaRefrigerador = 5;
	private int temperaturaCongelador = -5;
	
	public GeladeiraSmart() { }
	
	public GeladeiraSmart(String fabricante, String modelo, String id, boolean ligada, boolean frostFree,
			boolean duplex, int temperaturaRefrigerador, int temperaturaCongelador) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.id = id;
		this.ligada = ligada;
		this.frostFree = frostFree;
		this.duplex = duplex;
		this.temperaturaRefrigerador = temperaturaRefrigerador;
		this.temperaturaCongelador = temperaturaCongelador;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean isFrostFree() {
		return frostFree;
	}
	
	public void setFrostFree(boolean frostFree) {
		this.frostFree = frostFree;
	}
	
	public boolean isDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
	public int getTemperaturaRefrigerador() {
		return temperaturaRefrigerador;
	}
	
	public void setTemperaturaRefrigerador(int temperaturaRefrigerador) {
		this.temperaturaRefrigerador = temperaturaRefrigerador;
	}
	
	public int getTemperaturaCongelador() {
		return temperaturaCongelador;
	}
	
	public void setTemperaturaCongelador(int temperaturaCongelador) {
		this.temperaturaCongelador = temperaturaCongelador;
	}
	
	public boolean estaLigada() {
		return ligada;
	}
	
	public void ligar(boolean ligada) {
		this.ligada = ligada;
	}
	
}
