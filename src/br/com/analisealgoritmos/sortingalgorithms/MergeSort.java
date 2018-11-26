package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.MergeSortModel;

public class MergeSort {

	// Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;

	private MergeSortModel mergeSortModel;

	public MergeSort(int tipoCaso, int qtdValores, MergeSortModel mergeSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.mergeSortModel = mergeSortModel;

		construirArray();
		ordenarElementos(elementos, elementos.length);
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

	private void ordenarElementos(int elementos[], int n) {
		
		//Medir o tempo de ordenação.
		tempoInicial += System.currentTimeMillis();

		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = elementos[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = elementos[i];
		}
		ordenarElementos(l, mid);
		ordenarElementos(r, n - mid);

		merge(elementos, l, r, mid, n - mid);
		
		tempoFinal += System.currentTimeMillis();
	}

	private void merge(int[] a, int[] l, int[] r, int left, int right) {
		
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			comparacoes++;
			if (l[i] < r[j]) {
				trocas++;
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	private void setarResultados() {

		mergeSortModel.setComparacoes(comparacoes);
		mergeSortModel.setTrocas(trocas);
		mergeSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
