package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.HeapSortModel;

public class HeapSort {

	// Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;

	private HeapSortModel heapSortModel;

	public HeapSort(int tipoCaso, int qtdValores, HeapSortModel heapSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.heapSortModel = heapSortModel;

		construirArray();
		ordenarElementos();
		setarResultados();
	}

	private void construirArray() {

		elementos = new int[qtdValores];

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
		tempoInicial += System.currentTimeMillis();
		
		int n = elementos.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(elementos, n, i);
		
		for (int i = n - 1; i >= 0; i--) {
			int temp = elementos[0];
			elementos[0] = elementos[i];
			elementos[i] = temp;

			heapify(elementos, i, 0);
		}
		
		tempoFinal += System.currentTimeMillis();
	}

	void heapify(int arr[], int n, int i) {
		int largest = i; 
		int l = 2 * i + 1; 
		int r = 2 * i + 2; 

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		comparacoes++;
		if (largest != i) {
			trocas++;
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, n, largest);
		}
	}

	private void setarResultados() {

		heapSortModel.setComparacoes(comparacoes);
		heapSortModel.setTrocas(trocas);
		heapSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
