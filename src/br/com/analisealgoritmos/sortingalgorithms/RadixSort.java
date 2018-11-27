package br.com.analisealgoritmos.sortingalgorithms;

import java.util.Arrays;

import br.com.analisealgoritmos.model.RadixSortModel;

public class RadixSort {

	// Atributos.
	private static int trocas = 0;
	private static int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;

	private RadixSortModel radixSortModel;

	public RadixSort(int tipoCaso, int qtdValores, RadixSortModel radixSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.radixSortModel = radixSortModel;

		construirArray();
		// Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();
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

	static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++) {
			comparacoes++;
			if (arr[i] > mx) {
				trocas++;
				mx = arr[i];
			}
		}
		return mx;
	}

	static void countSort(int arr[], int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			trocas++;
			count[(arr[i] / exp) % 10]--;
		}

		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	static void ordenarElementos(int arr[], int n) {

		int m = getMax(arr, n);

		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}

	private void setarResultados() {

		tempoFinal = System.currentTimeMillis();

		radixSortModel.setComparacoes(comparacoes);
		radixSortModel.setTrocas(trocas);
		radixSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
