package br.com.analisealgoritmos.model;

public class RadixSortModel {

	private int trocas;
	private int comparacoes;
	private long tempo;
	
	public RadixSortModel(int trocas, int comparacoes, long tempo) {
		this.trocas = trocas;
		this.comparacoes = comparacoes;
		this.tempo = tempo;
	}
	
	public RadixSortModel() {
		
	}

	public int getTrocas() {
		return trocas;
	}

	public void setTrocas(int trocas) {
		this.trocas = trocas;
	}

	public int getComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(int comparacoes) {
		this.comparacoes = comparacoes;
	}

	public long getTempo() {
		return tempo;
	}

	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
}
