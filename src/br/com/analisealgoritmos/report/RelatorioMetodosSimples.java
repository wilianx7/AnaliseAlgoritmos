package br.com.analisealgoritmos.report;


import br.com.analisealgoritmos.model.BubbleSortModel;
import br.com.analisealgoritmos.model.CombSortModel;
import br.com.analisealgoritmos.model.InsertionSortModel;
import br.com.analisealgoritmos.model.MetodosSimplesModel;
import br.com.analisealgoritmos.model.RelatorioModel;
import br.com.analisealgoritmos.model.SelectionSortModel;
import br.com.analisealgoritmos.sortingalgorithms.BubbleSort;
import br.com.analisealgoritmos.sortingalgorithms.CombSort;
import br.com.analisealgoritmos.sortingalgorithms.InsertionSort;
import br.com.analisealgoritmos.sortingalgorithms.SelectionSort;

public class RelatorioMetodosSimples {
	
	private MetodosSimplesModel modelMS;
	private RelatorioModel relatorioFinal = new RelatorioModel();
	
	//Insertion Sort.
	@SuppressWarnings("unused")
	private InsertionSort insertionSort;
	private InsertionSortModel insertionSortModel = new InsertionSortModel();
	
	//Bubble Sort.
	@SuppressWarnings("unused")
	private BubbleSort bubbleSort;
	private BubbleSortModel bubbleSortModel = new BubbleSortModel();
	
	//Selection Sort
	@SuppressWarnings("unused")
	private SelectionSort selectionSort;
	private SelectionSortModel selectionSortModel = new SelectionSortModel();
	
	//Comb Sort
	@SuppressWarnings("unused")
	private CombSort combSort;
	private CombSortModel combSortModel = new CombSortModel();

	public RelatorioMetodosSimples(MetodosSimplesModel modelMS) {
		this.modelMS = modelMS;
		this.relatorioFinal.setQtdValores(this.modelMS.getQtdValores());
		construirRelatorio();
	}
	
	//Constroi o relatório de acordo com as opções setadas pelo usuário.
	public void construirRelatorio() {
		
		//Insertion Sort.
		if(modelMS.isCheckInsertionSort()) {
			
			insertionSort = new InsertionSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), insertionSortModel);
			relatorioFinal.setInsertionSortModel(insertionSortModel);
//			System.out.println("**********\nInsertion Sort\n");
//			System.out.println("Tempo: " + insertionSortModel.getTempo() + "Trocas: " + insertionSortModel.getTrocas() 
//			+ "Comparações: " + insertionSortModel.getComparacoes());
		}
		
		//Bubble Sort.
		if(modelMS.isCheckBubbleSort()) {
			
			bubbleSort = new BubbleSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), bubbleSortModel);
			relatorioFinal.setBubbleSortModel(bubbleSortModel);
//			System.out.println("**********\nBubble Sort\n");
//			System.out.println("Tempo: " + bubbleSortModel.getTempo() + "Trocas: " + bubbleSortModel.getTrocas() 
//			+ "Comparações: " + bubbleSortModel.getComparacoes());
		}
		
		//Selection Sort.
		if(modelMS.isCheckSelectionSort()) {
			
			selectionSort = new SelectionSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), selectionSortModel);
			relatorioFinal.setSelectionSortModel(selectionSortModel);
//			System.out.println("**********\nSelection Sort\n");
//			System.out.println("Tempo: " + selectionSortModel.getTempo() + "Trocas: " + selectionSortModel.getTrocas() 
//			+ "Comparações: " + selectionSortModel.getComparacoes());
		}
		
		//Comb Sort.
		if(modelMS.isCheckCombSort()) {
			
			combSort = new CombSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), combSortModel);
			relatorioFinal.setCombSortModel(combSortModel);
//			System.out.println("**********\nComb Sort\n");
//			System.out.println("Tempo: " + combSortModel.getTempo() + "Trocas: " + combSortModel.getTrocas() 
//			+ "Comparações: " + combSortModel.getComparacoes());
		}
	}
	
	public RelatorioModel getRelatorioFinal() {
		return relatorioFinal;
	}
	
}
