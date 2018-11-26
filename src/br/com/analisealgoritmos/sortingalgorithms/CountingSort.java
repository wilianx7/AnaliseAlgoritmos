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
		tempoInicial = System.currentTimeMillis();
		
		int n = elementos.length;
        
        int vetorAuxiliar[] = new int[n];
         
        for(int i = 0; i < n; i++){
            vetorAuxiliar[i] = 0;
        }
        
        for(int i = 0; i < n; i++){
            vetorAuxiliar[elementos[i]]++;
        }
        
        int sum = 0;                
        for(int i = 1; i < n; i++){
            int dum = vetorAuxiliar[i];
            vetorAuxiliar[i] = sum;
            sum += dum;
        }       
        int vetorOrdenado[] = new int[n];
        for(int i = 0; i < n; i++){
        	trocas++;
            vetorOrdenado[vetorAuxiliar[elementos[i]]] = elementos[i];
            vetorAuxiliar[elementos[i]]++;
        }
        
        for (int i = 0; i < n; i++){
            elementos[i] = vetorOrdenado[i];
        }
		
        tempoFinal = System.currentTimeMillis();
	}
	
	private void setarResultados() {

		countingSortModel.setComparacoes(comparacoes);
		countingSortModel.setTrocas(trocas);
		countingSortModel.setTempo(tempoFinal - tempoInicial);
	}

}
