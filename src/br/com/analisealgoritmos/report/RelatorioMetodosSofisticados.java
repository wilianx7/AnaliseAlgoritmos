package br.com.analisealgoritmos.report;

import br.com.analisealgoritmos.model.CountingSortModel;
import br.com.analisealgoritmos.model.HeapSortModel;
import br.com.analisealgoritmos.model.MergeSortModel;
import br.com.analisealgoritmos.model.MetodosSofisticadosModel;
import br.com.analisealgoritmos.model.QuickSortModel;
import br.com.analisealgoritmos.model.RadixSortModel;
import br.com.analisealgoritmos.model.RelatorioSofisticadoModel;
import br.com.analisealgoritmos.sortingalgorithms.CountingSort;
import br.com.analisealgoritmos.sortingalgorithms.HeapSort;
import br.com.analisealgoritmos.sortingalgorithms.MergeSort;
import br.com.analisealgoritmos.sortingalgorithms.QuickSort;
import br.com.analisealgoritmos.sortingalgorithms.RadixSort;

public class RelatorioMetodosSofisticados {

	private MetodosSofisticadosModel modelMS;
	private RelatorioSofisticadoModel relatorioFinal = new RelatorioSofisticadoModel();

	// Merge Sort.
	@SuppressWarnings("unused")
	private MergeSort mergeSort;
	private MergeSortModel mergeSortModel = new MergeSortModel();

	// Counting Sort.
	@SuppressWarnings("unused")
	private CountingSort countingSort;
	private CountingSortModel countingSortModel = new CountingSortModel();

	// Quick Sort
	@SuppressWarnings("unused")
	private QuickSort quickSort;
	private QuickSortModel quickSortModel = new QuickSortModel();

	// Heap Sort
	@SuppressWarnings("unused")
	private HeapSort heapSort;
	private HeapSortModel heapSortModel = new HeapSortModel();

	// Radix Sort
	@SuppressWarnings("unused")
	private RadixSort radixSort;
	private RadixSortModel radixSortModel = new RadixSortModel();

	public RelatorioMetodosSofisticados(MetodosSofisticadosModel modelMS) {
		this.modelMS = modelMS;
		this.relatorioFinal.setQtdValores(this.modelMS.getQtdValores());
		construirRelatorio();
	}

	// Constroi o relatório de acordo com as opções setadas pelo usuário.
	public void construirRelatorio() {

		// Merge Sort.
		if (modelMS.isCheckMergeSort()) {

			mergeSort = new MergeSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), mergeSortModel);
			relatorioFinal.setMergeSortModel(mergeSortModel);
		}

		// Quick Sort.
		if (modelMS.isCheckQuickSort()) {

			quickSort = new QuickSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), quickSortModel);
			relatorioFinal.setQuickSortModel(quickSortModel);
		}

		// Counting Sort.
		if (modelMS.isCheckCountingSort()) {

			countingSort = new CountingSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), countingSortModel);
			relatorioFinal.setCountingSortModel(countingSortModel);
		}

		// Heap Sort.
		if (modelMS.isCheckHeapSort()) {

			heapSort = new HeapSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), heapSortModel);
			relatorioFinal.setHeapSortModel(heapSortModel);
		}

		// Radix Sort.
		if (modelMS.isCheckRadixSort()) {

			radixSort = new RadixSort(modelMS.getTipoCaso(), modelMS.getQtdValores(), radixSortModel);
			relatorioFinal.setRadixSortModel(radixSortModel);
		}
	}

	public RelatorioSofisticadoModel getRelatorioFinal() {
		return relatorioFinal;
	}
}
