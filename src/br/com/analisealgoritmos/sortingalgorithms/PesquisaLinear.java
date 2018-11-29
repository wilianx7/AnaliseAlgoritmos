package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.PesquisaLinearModel;

public class PesquisaLinear {

	// Atributos.
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;

	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	private int valorAlvo;
	private int indiceValorAlvo = -1;

	private PesquisaLinearModel pesquisaLinearModel;

	public PesquisaLinear(int tipoCaso, int qtdValores, int valorAlvo, PesquisaLinearModel pesquisaLinearModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.valorAlvo = valorAlvo;
		this.pesquisaLinearModel = pesquisaLinearModel;

		construirArray();
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
		
		// Medir o tempo de ordenação.
		tempoInicial = System.currentTimeMillis();

		for(int i = 0; i < elementos.length; i++) {
			
			comparacoes++;
			if(elementos[i] == valorAlvo) {
				indiceValorAlvo = i;
				break;
			}
		}

		tempoFinal = System.currentTimeMillis();
	}

	private void setarResultados() {

		pesquisaLinearModel.setIndiceValorAlvo(indiceValorAlvo);
		pesquisaLinearModel.setComparacoes(comparacoes);
		pesquisaLinearModel.setTempo(tempoFinal - tempoInicial);
	}

}
