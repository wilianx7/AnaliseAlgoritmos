package br.com.analisealgoritmos.model;

public class RelatorioPesquisaModel {

	// Pesquisa Linear.
	private PesquisaLinearModel pesquisaLinearModel;

	// Pesquisa Binária.
	private PesquisaBinariaModel pesquisaBinariaModel;

	// Valores.
	private int qtdValores;
	private int valorAlvo;
	private int indiceValorProcurado;

	// Atributos.
	private boolean tempo;
	private boolean comparacoes;
	public PesquisaLinearModel getPesquisaLinearModel() {
		return pesquisaLinearModel;
	}
	public void setPesquisaLinearModel(PesquisaLinearModel pesquisaLinearModel) {
		this.pesquisaLinearModel = pesquisaLinearModel;
		this.indiceValorProcurado = pesquisaLinearModel.getIndiceValorAlvo();
	}
	public PesquisaBinariaModel getPesquisaBinariaModel() {
		return pesquisaBinariaModel;
	}
	public void setPesquisaBinariaModel(PesquisaBinariaModel pesquisaBinariaModel) {
		this.pesquisaBinariaModel = pesquisaBinariaModel;
		this.indiceValorProcurado = pesquisaBinariaModel.getIndiceValorAlvo();
	}
	public int getQtdValores() {
		return qtdValores;
	}
	public void setQtdValores(int qtdValores) {
		this.qtdValores = qtdValores;
	}
	public int getValorAlvo() {
		return valorAlvo;
	}
	public void setValorAlvo(int valorAlvo) {
		this.valorAlvo = valorAlvo;
	}
	public boolean isTempo() {
		return tempo;
	}
	public void setTempo(boolean tempo) {
		this.tempo = tempo;
	}
	public boolean isComparacoes() {
		return comparacoes;
	}
	public void setComparacoes(boolean comparacoes) {
		this.comparacoes = comparacoes;
	}
	public int getIndiceValorProcurado() {
		return indiceValorProcurado;
	}
	public void setIndiceValorProcurado(int indiceValorProcurado) {
		this.indiceValorProcurado = indiceValorProcurado;
	}
	
}
