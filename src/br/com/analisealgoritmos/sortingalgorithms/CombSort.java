package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.CombSortModel;

public class CombSort {

	//Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;
		
		
	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	
	//Auxiliares.
	private int i;
	private int j;
	private int intervalo = qtdValores;
	private int trocado = 1;
	private int aux;
		
	private CombSortModel combSortModel;
	
	public CombSort(int tipoCaso, int qtdValores, CombSortModel combSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.combSortModel = combSortModel;
		
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
		
		while (intervalo > 1 || trocado == 1)
		{
			intervalo = intervalo * 10 / 13;
			if (intervalo == 9 || intervalo == 10) intervalo = 11;
			if (intervalo < 1) intervalo = 1;
			trocado = 0;
			for (i = 0, j = intervalo; j < elementos.length; i++, j++)
			{
				comparacoes++;
				if (elementos[i] > elementos[j])
				{
					trocas++;
					
					aux = elementos[i];
					elementos[i] = elementos[j];
					elementos[j] = aux;
					trocado = 1;
				}
			}
		}
		
		tempoFinal = System.currentTimeMillis();
	}
	
	private void setarResultados() {

		combSortModel.setComparacoes(comparacoes);
		combSortModel.setTrocas(trocas);
		combSortModel.setTempo(tempoFinal - tempoInicial);
	}
}
