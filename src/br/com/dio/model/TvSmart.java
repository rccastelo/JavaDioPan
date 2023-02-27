package br.com.dio.model;

public class TvSmart {

	private String fabricante;
	private String modelo;
	private String id;
	private boolean ligada = false;
	private int volume = 10;
	private int canal = 1;

	public TvSmart() { }

	public TvSmart(String fabricante, String modelo, String id, boolean ligada, int volume, int canal) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.id = id;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}

	public boolean estaLigada() {
		return this.ligada;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

	public int consultarVolume() {
		return this.volume;
	}

	public void alterarVolume(int volume) {
		this.volume = volume;
	}

	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public int consultarCanal() {
		return this.canal;
	}

	public void alterarCanal(int canal) {
		this.canal = canal;
	}
	
	public void aumentarCanal() {
		this.canal++;
	}
	
	public void diminuirCanal() {
		this.canal--;
	}

	public void alterarFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String consultarFabricante() {
		return this.fabricante;
	}

	public void alterarModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String consultarModelo() {
		return this.modelo;
	}

	public void alterarId(String id) {
		this.id = id;
	}
	
	public String consultarId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "TvSmart fabricante [" + fabricante + "] modelo [" + modelo + "] id [" + id + "] ligada [" + ligada
				+ "] volume [" + volume + "] canal [" + canal + "]";
	}

}
