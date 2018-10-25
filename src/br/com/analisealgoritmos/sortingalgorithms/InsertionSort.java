package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.InsertionSortModel;

public class InsertionSort {
	
	//Auxiliares.
	private int j, k;
	
	//Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;
	
	
	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	
	private InsertionSortModel insertionSortModel;
	
	public InsertionSort(int tipoCaso, int qtdValores, InsertionSortModel insertionSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.insertionSortModel = insertionSortModel;
		
		construirArray();						
		ordenarElementos();
		setarResultados();
	}
	
	//Construir o array de acordo com o tipo de caso:
	//1 - Melhor caso;
	//2 - Caso Médio;
	//3 - Pior caso.
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
		
		int ch;

		for (int i = 1; i < elementos.length; i++) {
			j = i - 1;
			ch = elementos[i];
			k = 0;

			while (j > -1 && k == 0) {
				comparacoes++;
				if (ch < elementos[j]) {
					trocas++;
					elementos[j + 1] = elementos[j];
					j = j - 1;
				} else {
					k = j + 1;
				}
			}
			elementos[k] = ch;
		}
		
		tempoFinal = System.currentTimeMillis();
	}
	
	private void setarResultados() {

		insertionSortModel.setComparacoes(comparacoes);
		insertionSortModel.setTrocas(trocas);
		insertionSortModel.setTempo(tempoFinal - tempoInicial);
	}
	
}
