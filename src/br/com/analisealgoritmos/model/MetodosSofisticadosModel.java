package br.com.analisealgoritmos.model;

public class MetodosSofisticadosModel {

	private boolean checkMergeSort;
	private boolean checkHeapSort;
	private boolean checkQuickSort;
	private boolean checkRadixSort;
	private boolean checkCountingSort;

	private boolean checkTempo;
	private boolean checkComparacoes;
	private boolean checkTrocas;

	private int tipoCaso;

	private int qtdValores;

	public MetodosSofisticadosModel() {

	}

	public MetodosSofisticadosModel(boolean checkMergeSort, boolean checkHeapSort, boolean checkQuickSort,
			boolean checkRadixSort, boolean checkCountingSort, boolean checkTempo, boolean checkComparacoes,
			boolean checkTrocas, int tipoCaso, int qtdValores) {

		this.checkMergeSort = checkMergeSort;
		this.checkHeapSort = checkHeapSort;
		this.checkQuickSort = checkQuickSort;
		this.checkRadixSort = checkRadixSort;
		this.checkCountingSort = checkCountingSort;

		this.checkTempo = checkTempo;
		this.checkComparacoes = checkComparacoes;
		this.checkTrocas = checkTrocas;

		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
	}

	public boolean isCheckMergeSort() {
		return checkMergeSort;
	}

	public void setCheckMergeSort(boolean checkMergeSort) {
		this.checkMergeSort = checkMergeSort;
	}

	public boolean isCheckHeapSort() {
		return checkHeapSort;
	}

	public void setCheckHeapSort(boolean checkHeapSort) {
		this.checkHeapSort = checkHeapSort;
	}

	public boolean isCheckQuickSort() {
		return checkQuickSort;
	}

	public void setCheckQuickSort(boolean checkQuickSort) {
		this.checkQuickSort = checkQuickSort;
	}

	public boolean isCheckRadixSort() {
		return checkRadixSort;
	}

	public void setCheckRadixSort(boolean checkRadixSort) {
		this.checkRadixSort = checkRadixSort;
	}

	public boolean isCheckCountingSort() {
		return checkCountingSort;
	}

	public void setCheckCountingSort(boolean checkCountingSort) {
		this.checkCountingSort = checkCountingSort;
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
