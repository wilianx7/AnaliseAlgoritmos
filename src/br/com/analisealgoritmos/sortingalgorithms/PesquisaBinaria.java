package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.PesquisaBinariaModel;

public class PesquisaBinaria {

	// Atributos.
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	private int valorAlvo;
	private int indiceValorAlvo = -1;

	private PesquisaBinariaModel pesquisaBinariaModel;

	public PesquisaBinaria(int tipoCaso, int qtdValores, int valorAlvo, PesquisaBinariaModel pesquisaBinariaModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.valorAlvo = valorAlvo;
		this.pesquisaBinariaModel = pesquisaBinariaModel;

		construirArray();
		// Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();
		PesquisarValor();
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

	private void PesquisarValor() {

		int inf = 0;
		int sup = elementos.length - 1;
		int meio;
		while (inf <= sup) {
			meio = (inf + sup) / 2;
			comparacoes++;
			if (valorAlvo == elementos[meio]) {
				indiceValorAlvo = meio;
				break;
			}
			if (valorAlvo < elementos[meio]) {
				sup = meio - 1;
			} else {
				inf = meio + 1;
			}
		}
		
	}

	private void setarResultados() {

		tempoFinal = System.currentTimeMillis();
		pesquisaBinariaModel.setIndiceValorAlvo(indiceValorAlvo);
		pesquisaBinariaModel.setComparacoes(comparacoes);
		pesquisaBinariaModel.setTempo(tempoFinal - tempoInicial);
	}

}
