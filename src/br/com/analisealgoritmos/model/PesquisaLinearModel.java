package br.com.analisealgoritmos.model;

public class PesquisaLinearModel {

	private int indiceValorAlvo;
	private int comparacoes;
	private long tempo;
	
	public PesquisaLinearModel(int indiceValorAlvo, int comparacoes, long tempo) {
		this.indiceValorAlvo = indiceValorAlvo;
		this.comparacoes = comparacoes;
		this.tempo = tempo;
	}
	
	public PesquisaLinearModel() {
		
	}

	public int getIndiceValorAlvo() {
		return indiceValorAlvo;
	}

	public void setIndiceValorAlvo(int indiceValorAlvo) {
		this.indiceValorAlvo = indiceValorAlvo;
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
