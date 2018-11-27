package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.CountingSortModel;

public class CountingSort {

	// Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;

	private CountingSortModel countingSortModel;

	public CountingSort(int tipoCaso, int qtdValores, CountingSortModel countingSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.countingSortModel = countingSortModel;

		construirArray();
		ordenarElementos(elementos);
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

	private void ordenarElementos(int[] v) {

		// Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();

		int maior = v[0];
		for (int i = 1; i < v.length; i++) {
			comparacoes++;
			if (v[i] > maior) {
				maior = v[i];
			}
		}

		// frequencia
		int[] c = new int[maior];
		for (int i = 0; i < v.length; i++) {
			try {
				c[v[i] - 1] += 1;
			} catch (Exception e) {
				break;
			}
		}

		// cumulativa
		for (int i = 1; i < maior; i++) {
			trocas++;
			c[i] += c[i - 1];
		}

		Integer[] b = new Integer[v.length];
		for (int i = 0; i < b.length; i++) {
			try {
				b[c[v[i] - 1] - 1] = v[i];
				c[v[i] - 1]--;
			} catch (Exception e) {
				break;
			}
		}

		for (int i = 0; i < b.length; i++) {
			try {
				v[i] = b[i];
			} catch (Exception e) {
				break;
			}

		}

		tempoFinal = System.currentTimeMillis();
	}

	private void setarResultados() {

		countingSortModel.setComparacoes(comparacoes);
		countingSortModel.setTrocas(trocas);
		countingSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
