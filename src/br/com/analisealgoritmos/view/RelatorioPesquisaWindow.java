package br.com.analisealgoritmos.view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.analisealgoritmos.model.RelatorioPesquisaModel;

public class RelatorioPesquisaWindow extends AbstractWindowFrame {
	private static final long serialVersionUID = 6219816385533691418L;

	// Paineis.
	private JPanel panel;

	// Descrição dos componentes.
	private JLabel descricao;

	// JTextFields Tempos.
	private JTextField txfPesquisaLinearTemp;
	private JTextField txfPesquisaBinariaTemp;

	// JTextFields Comparações.
	private JTextField txfPesquisaLinearComp;
	private JTextField txfPesquisaBinariaComp;

	// JTextFields Valores.
	private JTextField txfQtdValores;
	private JTextField txfValorProcurado;
	private JTextField txfIndiceValorProcurado;

	// Relatório.
	private RelatorioPesquisaModel relatorioModel;

	public RelatorioPesquisaWindow(RelatorioPesquisaModel relatorioModel) {
		super("Relatório da Pesquisa");
		setBackground(new Color(250, 250, 250));
		this.relatorioModel = relatorioModel;
		criarComponentes();
		inserirDados();
	}

	private void criarComponentes() {

		// Painel Tempos.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 20, 450, 160));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(
		BorderFactory.createTitledBorder("Tempos (ms)"));
		getContentPane().add(panel);

		// Tempo Pesquisa Linear.
		descricao = new JLabel("Pesquisa Linear:");
		descricao.setBounds(15, 30, 120, 25);
		panel.add(descricao);

		txfPesquisaLinearTemp = new JTextField();
		txfPesquisaLinearTemp.setEditable(false);
		txfPesquisaLinearTemp.setBackground(new Color(250, 250, 250));
		txfPesquisaLinearTemp.setBounds(125, 30, 160, 25);
		panel.add(txfPesquisaLinearTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(295, 30, 120, 25);
		panel.add(descricao);

		// Tempo Pesquisa Binária.
		descricao = new JLabel("Pesquisa Binária:");
		descricao.setBounds(15, 75, 120, 25);
		panel.add(descricao);

		txfPesquisaBinariaTemp = new JTextField();
		txfPesquisaBinariaTemp.setEditable(false);
		txfPesquisaBinariaTemp.setBackground(new Color(250, 250, 250));
		txfPesquisaBinariaTemp.setBounds(125, 75, 160, 25);
		panel.add(txfPesquisaBinariaTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(295, 75, 120, 25);
		panel.add(descricao);

		// Painel Comparações.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 230, 450, 160));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(
		BorderFactory.createTitledBorder("Comparações"));
		getContentPane().add(panel);

		// Comparações Pesquisa Linear.
		descricao = new JLabel("Pesquisa Linear:");
		descricao.setBounds(15, 30, 120, 25);
		panel.add(descricao);

		txfPesquisaLinearComp = new JTextField();
		txfPesquisaLinearComp.setEditable(false);
		txfPesquisaLinearComp.setBackground(new Color(250, 250, 250));
		txfPesquisaLinearComp.setBounds(125, 30, 160, 25);
		panel.add(txfPesquisaLinearComp);

		// Comparações Pesquisa Binária.
		descricao = new JLabel("Pesquisa Binária:");
		descricao.setBounds(15, 75, 120, 25);
		panel.add(descricao);

		txfPesquisaBinariaComp = new JTextField();
		txfPesquisaBinariaComp.setEditable(false);
		txfPesquisaBinariaComp.setBackground(new Color(250, 250, 250));
		txfPesquisaBinariaComp.setBounds(125, 75, 160, 25);
		panel.add(txfPesquisaBinariaComp);

		// Painel Valores.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 440, 450, 160));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Valores"));
		getContentPane().add(panel);

		// Quantidade de Valores.
		descricao = new JLabel("Quantidade de Valores:");
		descricao.setBounds(15, 20, 200, 25);
		panel.add(descricao);

		txfQtdValores = new JTextField();
		txfQtdValores.setEditable(false);
		txfQtdValores.setBackground(new Color(250, 250, 250));
		txfQtdValores.setBounds(170, 20, 160, 25);
		panel.add(txfQtdValores);

		// Valor Procurado.
		descricao = new JLabel("Valor Procurado:");
		descricao.setBounds(15, 65, 200, 25);
		panel.add(descricao);

		txfValorProcurado = new JTextField();
		txfValorProcurado.setEditable(false);
		txfValorProcurado.setBackground(new Color(250, 250, 250));
		txfValorProcurado.setBounds(170, 65, 160, 25);
		panel.add(txfValorProcurado);

		// Indice Valor Procurado.
		descricao = new JLabel("Indice do Valor Procurado:");
		descricao.setBounds(15, 110, 220, 25);
		panel.add(descricao);

		txfIndiceValorProcurado = new JTextField();
		txfIndiceValorProcurado.setEditable(false);
		txfIndiceValorProcurado.setBackground(new Color(250, 250, 250));
		txfIndiceValorProcurado.setBounds(170, 110, 160, 25);
		panel.add(txfIndiceValorProcurado);
		
	}

	private void inserirDados() {

		// Tempos.
		if (relatorioModel.isTempo()) {

			if (relatorioModel.getPesquisaLinearModel() != null) {
				txfPesquisaLinearTemp.setText(String.valueOf(relatorioModel.getPesquisaLinearModel().getTempo()));
			}

			if (relatorioModel.getPesquisaBinariaModel() != null) {
				txfPesquisaBinariaTemp.setText(String.valueOf(relatorioModel.getPesquisaBinariaModel().getTempo()));
			}

		}

		// Comparações.
		if (relatorioModel.isComparacoes()) {

			if (relatorioModel.getPesquisaLinearModel() != null) {
				txfPesquisaLinearComp.setText(String.valueOf(relatorioModel.getPesquisaLinearModel().getComparacoes()));
			}

			if (relatorioModel.getPesquisaBinariaModel() != null) {
				txfPesquisaBinariaComp.setText(String.valueOf(relatorioModel.getPesquisaBinariaModel().getComparacoes()));
			}

		}

		// Valores.
		txfQtdValores.setText(String.valueOf(relatorioModel.getQtdValores()));
		txfValorProcurado.setText(String.valueOf(relatorioModel.getValorAlvo()));
		txfIndiceValorProcurado.setText(String.valueOf(relatorioModel.getIndiceValorProcurado()));

	}
}
