package br.com.analisealgoritmos.model;

public class MetodosSimplesModel {
	
	private boolean checkInsertionSort;
	private boolean checkSelectionSort;
	private boolean checkBubbleSort;
	private boolean checkCombSort;
	
	private boolean checkTempo;
	private boolean checkComparacoes;
	private boolean checkTrocas;
	
	private int tipoCaso;
	
	private int qtdValores;
	
	public MetodosSimplesModel() {
		
	}
	
	public MetodosSimplesModel(boolean checkInsertionSort, boolean checkSelectionSort, boolean checkBubbleSort,
			              boolean checkCombSort, boolean checkTempo, boolean checkComparacoes, boolean checkTrocas,
			              int tipoCaso, int qtdValores) {
		
		this.checkInsertionSort = checkInsertionSort;
		this.checkSelectionSort = checkSelectionSort;
		this.checkBubbleSort = checkBubbleSort;
		this.checkCombSort = checkCombSort;
		
		this.checkTempo = checkTempo;
		this.checkComparacoes = checkComparacoes;
		this.checkTrocas = checkTrocas;
		
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
	}
	
	

	public boolean isCheckInsertionSort() {
		return checkInsertionSort;
	}

	public void setCheckInsertionSort(boolean checkInsertionSort) {
		this.checkInsertionSort = checkInsertionSort;
	}

	public boolean isCheckSelectionSort() {
		return checkSelectionSort;
	}

	public void setCheckSelectionSort(boolean checkSelectionSort) {
		this.checkSelectionSort = checkSelectionSort;
	}

	public boolean isCheckBubbleSort() {
		return checkBubbleSort;
	}

	public void setCheckBubbleSort(boolean checkBubbleSort) {
		this.checkBubbleSort = checkBubbleSort;
	}

	public boolean isCheckCombSort() {
		return checkCombSort;
	}

	public void setCheckCombSort(boolean checkCombSort) {
		this.checkCombSort = checkCombSort;
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

	public boolean isCheckTrocas() {
		return checkTrocas;
	}

	public void setCheckTrocas(boolean checkTrocas) {
		this.checkTrocas = checkTrocas;
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
	
	

}
