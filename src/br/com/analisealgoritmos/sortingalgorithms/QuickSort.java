package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.QuickSortModel;

public class QuickSort {

	// Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;

	private QuickSortModel quickSortModel;

	public QuickSort(int tipoCaso, int qtdValores, QuickSortModel quickSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.quickSortModel = quickSortModel;

		construirArray();
		ordenarElementos(elementos, 0, elementos.length -1);
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

	private void ordenarElementos(int vetor[], int inicio, int fim) {

		// Medir o tempo de ordenação.
		tempoInicial += System.currentTimeMillis();

		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			ordenarElementos(vetor, inicio, posicaoPivo - 1);
			ordenarElementos(vetor, posicaoPivo + 1, fim);
		}

		tempoFinal += System.currentTimeMillis();
	}

	private int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			comparacoes++;
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				trocas++;
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

	private void setarResultados() {

		quickSortModel.setComparacoes(comparacoes);
		quickSortModel.setTrocas(trocas);
		quickSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
