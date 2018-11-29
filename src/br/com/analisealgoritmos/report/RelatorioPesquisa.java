package br.com.analisealgoritmos.report;

import br.com.analisealgoritmos.model.AlgoritmosPesquisaModel;
import br.com.analisealgoritmos.model.PesquisaBinariaModel;
import br.com.analisealgoritmos.model.PesquisaLinearModel;
import br.com.analisealgoritmos.model.RelatorioPesquisaModel;
import br.com.analisealgoritmos.sortingalgorithms.PesquisaBinaria;
import br.com.analisealgoritmos.sortingalgorithms.PesquisaLinear;

public class RelatorioPesquisa {

	private AlgoritmosPesquisaModel modelPesquisa;
	private RelatorioPesquisaModel relatorioFinal = new RelatorioPesquisaModel();

	// Pesquisa Linear.
	@SuppressWarnings("unused")
	private PesquisaLinear pesquisaLinear;
	private PesquisaLinearModel pesquisaLinearModel = new PesquisaLinearModel();

	// Pesquisa Bin�ria.
	@SuppressWarnings("unused")
	private PesquisaBinaria pesquisaBinaria;
	private PesquisaBinariaModel pesquisaBinariaModel = new PesquisaBinariaModel();

	public RelatorioPesquisa(AlgoritmosPesquisaModel modelPesquisa) {
		this.modelPesquisa = modelPesquisa;
		this.relatorioFinal.setQtdValores(this.modelPesquisa.getQtdValores());
		construirRelatorio();
	}

	// Constroi o relat�rio de acordo com as op��es setadas pelo usu�rio.
	public void construirRelatorio() {

		// Pesquisa Linear.
		if (modelPesquisa.isCheckPesquisaLinear()) {

			pesquisaLinear = new PesquisaLinear(modelPesquisa.getTipoCaso(), modelPesquisa.getQtdValores(), modelPesquisa.getValorAlvo(), pesquisaLinearModel);
			relatorioFinal.setPesquisaLinearModel(pesquisaLinearModel);
		}

		// Pesquisa Bin�ria.
		if (modelPesquisa.isCheckPesquisaBinaria()) {

			pesquisaBinaria = new PesquisaBinaria(modelPesquisa.getTipoCaso(), modelPesquisa.getQtdValores(), modelPesquisa.getValorAlvo(), pesquisaBinariaModel);
			relatorioFinal.setPesquisaBinariaModel(pesquisaBinariaModel);
		}
		
	}

	public RelatorioPesquisaModel getRelatorioFinal() {
		return relatorioFinal;
	}

}
