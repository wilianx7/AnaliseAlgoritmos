package br.com.analisealgoritmos.sortingalgorithms;

import br.com.analisealgoritmos.model.SelectionSortModel;

public class SelectionSort {

	//Atributos.
	private int trocas = 0;
	private int comparacoes = 0;
	private long tempoInicial;
	private long tempoFinal;
		
		
	private int elementos[];
	private int tipoCaso;
	private int qtdValores;
	
	//Auxiliares
	private int aux = 0;
	private int j = 0;
	private int min;
	
	private SelectionSortModel selectionSortModel;
	
	public SelectionSort(int tipoCaso, int qtdValores, SelectionSortModel selectionSortModel) {
		this.tipoCaso = tipoCaso;
		this.qtdValores = qtdValores;
		this.selectionSortModel = selectionSortModel;
		
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
		
		for (int i = 0; i < (elementos.length) - 1; i++){
		   min = i;
		   for (j = (i+1); j < elementos.length; j++) {	
			   comparacoes++;			   
			   if(elementos[j] < elementos[min]) { 
				   trocas++;
				   min = j;
			   }			   
		   }		   
		   if (elementos[i] != elementos[min]) {
			   aux = elementos[i];
		       elementos[i] = elementos[min];
		       elementos[min] = aux;
		   }		   
		}
		
		tempoFinal = System.currentTimeMillis();		  
	}
	
	private void setarResultados() {

		selectionSortModel.setComparacoes(comparacoes);
		selectionSortModel.setTrocas(trocas);
		selectionSortModel.setTempo(tempoFinal - tempoInicial);
	}
}
