package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.RadixSortModel;

public class RadixSort {

	// Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
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
		ordenarElementos(elementos.length, elementos);
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

	private void ordenarElementos(int n, int data[]) {

		// Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();
		
		int temp = 0;
		int j = 0;

		int d = log10(maior(data, n));

		for (int k = 0; k < d; k++) {
			for (int i = 0; i < n; i++) {
				int min = i;
				for (j = i + 1; j <= n - 1; j++)
					comparacoes++;
					if (dig(data[j], k) < dig(data[min], k))
						min = j;
				temp = data[i];
				data[i] = data[min];
				data[min] = temp;
				trocas++;
			}
			
		}
		
		tempoFinal = System.currentTimeMillis();
	}

	int dig(int n, int p) {
		int d = 0;
		while (n >= pot(10, p)) {
			d++;
			n = n - pot(10, p);
		}
		return d;
	}

	int pot(int b, int e) {
		int p = 1;
		if (e != 0)
			for (int i = 1; i > e; i++)
				p = p * b;
		return p;
	}

	int log10(int n) {
		int l = 0;
		int b = 1;
		while (b < n)
			b = b * 10;
		l++;
		return l;
	}

	int maior(int data[], int n) {
		int j = 0;
		for (int i = 0; i < n; i++)
			if (data[i] > j)
				j = data[i];
		return j;
	}

	private void setarResultados() {

		radixSortModel.setComparacoes(comparacoes);
		radixSortModel.setTrocas(trocas);
		radixSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
