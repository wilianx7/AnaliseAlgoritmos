package br.com.analisealgoritmos.model;

public class RelatorioModel {
	
	//Insertion Sort.
	InsertionSortModel insertionSortModel;
	
	//Bubble Sort.
	BubbleSortModel bubbleSortModel;
	
	//Selection Sort.
	SelectionSortModel selectionSortModel;
	
	//Comb Sort.
	CombSortModel combSortModel;
	
	//Valores.
	private int qtdValores;
	
	//Atributos.
	private boolean tempo;
	private boolean trocas;
	private boolean comparacoes;

//	public RelatorioModel(InsertionSortModel insertionSortModel, BubbleSortModel bubbleSortModel,
//			SelectionSortModel selectionSortModel, CombSortModel combSortModel) {
//		
//		this.insertionSortModel = insertionSortModel;
//		this.bubbleSortModel = bubbleSortModel;
//		this.selectionSortModel = selectionSortModel;
//		this.combSortModel = combSortModel;
//	}
	
	public RelatorioModel() {
		
	}

	public InsertionSortModel getInsertionSortModel() {
		return insertionSortModel;
	}

	public void setInsertionSortModel(InsertionSortModel insertionSortModel) {
		this.insertionSortModel = insertionSortModel;
	}

	public BubbleSortModel getBubbleSortModel() {
		return bubbleSortModel;
	}

	public void setBubbleSortModel(BubbleSortModel bubbleSortModel) {
		this.bubbleSortModel = bubbleSortModel;
	}

	public SelectionSortModel getSelectionSortModel() {
		return selectionSortModel;
	}

	public void setSelectionSortModel(SelectionSortModel selectionSortModel) {
		this.selectionSortModel = selectionSortModel;
	}

	public CombSortModel getCombSortModel() {
		return combSortModel;
	}

	public void setCombSortModel(CombSortModel combSortModel) {
		this.combSortModel = combSortModel;
	}

	public int getQtdValores() {
		return qtdValores;
	}

	public void setQtdValores(int qtdValores) {
		this.qtdValores = qtdValores;
	}

	public boolean isTempo() {
		return tempo;
	}

	public void setTempo(boolean tempo) {
		this.tempo = tempo;
	}

	public boolean isTrocas() {
		return trocas;
	}

	public void setTrocas(boolean trocas) {
		this.trocas = trocas;
	}

	public boolean isComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(boolean comparacoes) {
		this.comparacoes = comparacoes;
	}	
		
}
