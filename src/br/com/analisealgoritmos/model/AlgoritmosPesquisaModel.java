package br.com.analisealgoritmos.model;

public class AlgoritmosPesquisaModel {

	private boolean checkPesquisaLinear;
	private boolean checkPesquisaBinaria;

	private boolean checkTempo;
	private boolean checkComparacoes;

	private int tipoCaso;
	private int qtdValores;
	private int valorAlvo;

	public AlgoritmosPesquisaModel(boolean checkPesquisaLinear, boolean checkPesquisaBinaria,
			boolean checkTempo, boolean checkComparacoes, int tipoCaso, int qtdValores, int valorAlvo) {

		this.checkPesquisaLinear = checkPesquisaLinear;
		this.checkPesquisaBinaria = checkPesquisaBinaria;
		
		this.checkTempo = checkTempo;
		this.checkComparacoes = checkComparacoes;
		
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.valorAlvo = valorAlvo;
	}
	
	public AlgoritmosPesquisaModel() {
		
	}

	public boolean isCheckPesquisaLinear() {
		return checkPesquisaLinear;
	}

	public void setCheckPesquisaLinear(boolean checkPesquisaLinear) {
		this.checkPesquisaLinear = checkPesquisaLinear;
	}

	public boolean isCheckPesquisaBinaria() {
		return checkPesquisaBinaria;
	}

	public void setCheckPesquisaBinaria(boolean checkPesquisaBinaria) {
		this.checkPesquisaBinaria = checkPesquisaBinaria;
	}

	public boolean isCheckTempo() {
		return checkTempo;
	}

	public void setCheckTempo(boolean checkTempo) {
		this.checkTempo = checkTempo;
	}

	public boolean isCheckComparacoes() {
		return checkComparacoes;
	}

	public void setCheckComparacoes(boolean checkComparacoes) {
		this.checkComparacoes = checkComparacoes;
	}

	public int getTipoCaso() {
		return tipoCaso;
	}

	public void setTipoCaso(int tipoCaso) {
		this.tipoCaso = tipoCaso;
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

}
