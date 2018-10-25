package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.BubbleSortModel;

public class BubbleSort {
	
	//Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;		
		
	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	
	private BubbleSortModel bubbleSortModel = new BubbleSortModel();
	
	public BubbleSort(int tipoCaso, int qtdValores, BubbleSortModel bubbleSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.bubbleSortModel = bubbleSortModel;
		
		construirArray();						
		ordenarElementos();
		setarResultados();
	}
	
	private void construirArray() {
		
		elementos = new int [qtdValores];
		
		if (tipoCaso == 1) {
			for (int i = 0; i < elementos.length; i++) {
				elementos[i] = i + 1;
			}
		} else if (tipoCaso == 2) {
			for (int i = 0; i < elementos.length; i++) {
				elementos[i] = (int) (Math.random() * qtdValores);
			}
		} else {
			int j = elementos.length;
			for (int i = 0; i < elementos.length; i++) {
				elementos[i] = j;
				j--;
			}
		}
		
	}

	private void ordenarElementos() {
		
		//Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();
		
		int aux;

		for (int i = 0; i < elementos.length; i++) {
			
			for (int j = 0; j < (elementos.length - 1); j++) {
				comparacoes++;
				if (elementos[j] > elementos[j + 1]) {
					trocas++;
					aux = elementos[j];
					elementos[j] = elementos[j + 1];
					elementos[j + 1] = aux;
				}				
			}
		}
		
		tempoFinal = System.currentTimeMillis();
	}
	
	private void setarResultados() {

		bubbleSortModel.setComparacoes(comparacoes);
		bubbleSortModel.setTrocas(trocas);
		bubbleSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
