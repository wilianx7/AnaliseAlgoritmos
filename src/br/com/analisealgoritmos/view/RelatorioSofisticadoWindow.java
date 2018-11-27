package br.com.analisealgoritmos.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.com.analisealgoritmos.model.RelatorioSofisticadoModel;

public class RelatorioSofisticadoWindow extends AbstractWindowFrame {
	private static final long serialVersionUID = -9203951159048029258L;
	
	// Paineis.
	private JPanel panelPrincipal;
	private JPanel panelSecundario;
	private JScrollPane scroll;

	// Descrição dos componentes.
	private JLabel descricao;

	// JTextFields Tempos.
	private JTextField txfMergeSortTemp;
	private JTextField txfHeapSortTemp;
	private JTextField txfQuickSortTemp;
	private JTextField txfRadixSortTemp;
	private JTextField txfCountingSortTemp;

	// JTextFields Comparações.
	private JTextField txfMergeSortComp;
	private JTextField txfHeapSortComp;
	private JTextField txfQuickSortComp;
	private JTextField txfRadixSortComp;
	private JTextField txfCountingSortComp;

	// JTextFields Trocas.
	private JTextField txfMergeSortTroc;
	private JTextField txfHeapSortTroc;
	private JTextField txfQuickSortTroc;
	private JTextField txfRadixSortTroc;
	private JTextField txfCountingSortTroc;

	// Dados para o relatório.
	private RelatorioSofisticadoModel relatorioModel;

	public RelatorioSofisticadoWindow(RelatorioSofisticadoModel relatorioModel) {
		super("Relatório Métodos Sofisticados");
		this.relatorioModel = relatorioModel;
		criarComponentes();
		inserirDados();
	}

	private void criarComponentes() {

		panelPrincipal = new JPanel();
		panelPrincipal.setPreferredSize(new Dimension(835, 800));
		panelPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		panelPrincipal.setLayout(null);
		panelPrincipal.setBackground(new Color(250, 250, 250));

		scroll = new JScrollPane(panelPrincipal);
		scroll.setBounds(0, 0, 830, 652);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll);

		// Painel Tempos.
		panelSecundario = new JPanel();
		panelSecundario.setBounds(new Rectangle(175, 20, 450, 235));
		panelSecundario.setBackground(Color.WHITE);
		panelSecundario.setLayout(null);
		panelSecundario.setBorder(
				BorderFactory.createTitledBorder("Tempos (ms) (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panelSecundario);

		// Tempo Merge Sort.
		descricao = new JLabel("Merge Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panelSecundario.add(descricao);

		txfMergeSortTemp = new JTextField();
		txfMergeSortTemp.setEditable(false);
		txfMergeSortTemp.setBackground(new Color(250, 250, 250));
		txfMergeSortTemp.setBounds(105, 20, 160, 25);
		panelSecundario.add(txfMergeSortTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(275, 20, 120, 25);
		panelSecundario.add(descricao);

		// Tempo Heap Sort.
		descricao = new JLabel("Heap Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panelSecundario.add(descricao);

		txfHeapSortTemp = new JTextField();
		txfHeapSortTemp.setEditable(false);
		txfHeapSortTemp.setBackground(new Color(250, 250, 250));
		txfHeapSortTemp.setBounds(105, 65, 160, 25);
		panelSecundario.add(txfHeapSortTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(275, 65, 120, 25);
		panelSecundario.add(descricao);

		// Tempo Quick Sort.
		descricao = new JLabel("Quick Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panelSecundario.add(descricao);

		txfQuickSortTemp = new JTextField();
		txfQuickSortTemp.setEditable(false);
		txfQuickSortTemp.setBackground(new Color(250, 250, 250));
		txfQuickSortTemp.setBounds(105, 110, 160, 25);
		panelSecundario.add(txfQuickSortTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(275, 110, 120, 25);
		panelSecundario.add(descricao);

		// Tempo Radix Sort.
		descricao = new JLabel("Radix Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panelSecundario.add(descricao);

		txfRadixSortTemp = new JTextField();
		txfRadixSortTemp.setEditable(false);
		txfRadixSortTemp.setBackground(new Color(250, 250, 250));
		txfRadixSortTemp.setBounds(105, 155, 160, 25);
		panelSecundario.add(txfRadixSortTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(275, 155, 120, 25);
		panelSecundario.add(descricao);

		// Tempo Counting Sort.
		descricao = new JLabel("Counting Sort:");
		descricao.setBounds(15, 200, 120, 25);
		panelSecundario.add(descricao);

		txfCountingSortTemp = new JTextField();
		txfCountingSortTemp.setEditable(false);
		txfCountingSortTemp.setBackground(new Color(250, 250, 250));
		txfCountingSortTemp.setBounds(105, 200, 160, 25);
		panelSecundario.add(txfCountingSortTemp);

		descricao = new JLabel("ms");
		descricao.setBounds(275, 200, 120, 25);
		panelSecundario.add(descricao);

		panelPrincipal.add(panelSecundario);

		// Painel Comparações.
		panelSecundario = new JPanel();
		panelSecundario.setBounds(new Rectangle(175, 275, 450, 235));
		panelSecundario.setBackground(Color.WHITE);
		panelSecundario.setLayout(null);
		panelSecundario.setBorder(
				BorderFactory.createTitledBorder("Comparações (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panelSecundario);

		// Comparações Merge Sort.
		descricao = new JLabel("Merge Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panelSecundario.add(descricao);

		txfMergeSortComp = new JTextField();
		txfMergeSortComp.setEditable(false);
		txfMergeSortComp.setBackground(new Color(250, 250, 250));
		txfMergeSortComp.setBounds(105, 20, 160, 25);
		panelSecundario.add(txfMergeSortComp);

		// Comparações Heap Sort.
		descricao = new JLabel("Heap Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panelSecundario.add(descricao);

		txfHeapSortComp = new JTextField();
		txfHeapSortComp.setEditable(false);
		txfHeapSortComp.setBackground(new Color(250, 250, 250));
		txfHeapSortComp.setBounds(105, 65, 160, 25);
		panelSecundario.add(txfHeapSortComp);

		// Comparações Quick Sort.
		descricao = new JLabel("Quick Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panelSecundario.add(descricao);

		txfQuickSortComp = new JTextField();
		txfQuickSortComp.setEditable(false);
		txfQuickSortComp.setBackground(new Color(250, 250, 250));
		txfQuickSortComp.setBounds(105, 110, 160, 25);
		panelSecundario.add(txfQuickSortComp);

		// Comparações Radix Sort.
		descricao = new JLabel("Radix Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panelSecundario.add(descricao);

		txfRadixSortComp = new JTextField();
		txfRadixSortComp.setEditable(false);
		txfRadixSortComp.setBackground(new Color(250, 250, 250));
		txfRadixSortComp.setBounds(105, 155, 160, 25);
		panelSecundario.add(txfRadixSortComp);

		// Comparações Counting Sort.
		descricao = new JLabel("Counting Sort:");
		descricao.setBounds(15, 200, 120, 25);
		panelSecundario.add(descricao);

		txfCountingSortComp = new JTextField();
		txfCountingSortComp.setEditable(false);
		txfCountingSortComp.setBackground(new Color(250, 250, 250));
		txfCountingSortComp.setBounds(105, 200, 160, 25);
		panelSecundario.add(txfCountingSortComp);

		panelPrincipal.add(panelSecundario);

		// Painel Trocas.
		panelSecundario = new JPanel();
		panelSecundario.setBounds(new Rectangle(175, 530, 450, 235));
		panelSecundario.setBackground(Color.WHITE);
		panelSecundario.setLayout(null);
		panelSecundario
				.setBorder(BorderFactory.createTitledBorder("Trocas (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panelSecundario);

		// Trocas Merge Sort.
		descricao = new JLabel("Merge Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panelSecundario.add(descricao);

		txfMergeSortTroc = new JTextField();
		txfMergeSortTroc.setEditable(false);
		txfMergeSortTroc.setBackground(new Color(250, 250, 250));
		txfMergeSortTroc.setBounds(105, 20, 160, 25);
		panelSecundario.add(txfMergeSortTroc);

		// Trocas Heap Sort.
		descricao = new JLabel("Heap Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panelSecundario.add(descricao);

		txfHeapSortTroc = new JTextField();
		txfHeapSortTroc.setEditable(false);
		txfHeapSortTroc.setBackground(new Color(250, 250, 250));
		txfHeapSortTroc.setBounds(105, 65, 160, 25);
		panelSecundario.add(txfHeapSortTroc);

		// Trocas Quick Sort.
		descricao = new JLabel("Quick Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panelSecundario.add(descricao);

		txfQuickSortTroc = new JTextField();
		txfQuickSortTroc.setEditable(false);
		txfQuickSortTroc.setBackground(new Color(250, 250, 250));
		txfQuickSortTroc.setBounds(105, 110, 160, 25);
		panelSecundario.add(txfQuickSortTroc);

		// Trocas Radix Sort.
		descricao = new JLabel("Radix Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panelSecundario.add(descricao);

		txfRadixSortTroc = new JTextField();
		txfRadixSortTroc.setEditable(false);
		txfRadixSortTroc.setBackground(new Color(250, 250, 250));
		txfRadixSortTroc.setBounds(105, 155, 160, 25);
		panelSecundario.add(txfRadixSortTroc);

		// Trocas Counting Sort.
		descricao = new JLabel("Counting Sort:");
		descricao.setBounds(15, 200, 120, 25);
		panelSecundario.add(descricao);

		txfCountingSortTroc = new JTextField();
		txfCountingSortTroc.setEditable(false);
		txfCountingSortTroc.setBackground(new Color(250, 250, 250));
		txfCountingSortTroc.setBounds(105, 200, 160, 25);
		panelSecundario.add(txfCountingSortTroc);

		panelPrincipal.add(panelSecundario);

	}

	private void inserirDados() {

		// Tempos.
		if (relatorioModel.isTempo()) {

			if (relatorioModel.getMergeSortModel() != null) {
				txfMergeSortTemp.setText(String.valueOf(relatorioModel.getMergeSortModel().getTempo()));
			}

			if (relatorioModel.getHeapSortModel() != null) {
				txfHeapSortTemp.setText(String.valueOf(relatorioModel.getHeapSortModel().getTempo()));
			}

			if (relatorioModel.getQuickSortModel() != null) {
				txfQuickSortTemp.setText(String.valueOf(relatorioModel.getQuickSortModel().getTempo()));
			}

			if (relatorioModel.getRadixSortModel() != null) {
				txfRadixSortTemp.setText(String.valueOf(relatorioModel.getRadixSortModel().getTempo()));
			}
			
			if (relatorioModel.getCountingSortModel() != null) {
				txfCountingSortTemp.setText(String.valueOf(relatorioModel.getCountingSortModel().getTempo()));
			}

		}

		// Comparações.
		if (relatorioModel.isComparacoes()) {

			if (relatorioModel.getMergeSortModel() != null) {
				txfMergeSortComp.setText(String.valueOf(relatorioModel.getMergeSortModel().getComparacoes()));
			}

			if (relatorioModel.getHeapSortModel() != null) {
				txfHeapSortComp.setText(String.valueOf(relatorioModel.getHeapSortModel().getComparacoes()));
			}

			if (relatorioModel.getQuickSortModel() != null) {
				txfQuickSortComp.setText(String.valueOf(relatorioModel.getQuickSortModel().getComparacoes()));
			}

			if (relatorioModel.getRadixSortModel() != null) {
				txfRadixSortComp.setText(String.valueOf(relatorioModel.getRadixSortModel().getComparacoes()));
			}
			
			if (relatorioModel.getCountingSortModel() != null) {
				txfCountingSortComp.setText(String.valueOf(relatorioModel.getCountingSortModel().getComparacoes()));
			}

		}

		// Trocas.
		if (relatorioModel.isTrocas()) {

			if (relatorioModel.getMergeSortModel() != null) {
				txfMergeSortTroc.setText(String.valueOf(relatorioModel.getMergeSortModel().getTrocas()));
			}

			if (relatorioModel.getHeapSortModel() != null) {
				txfHeapSortTroc.setText(String.valueOf(relatorioModel.getHeapSortModel().getTrocas()));
			}

			if (relatorioModel.getQuickSortModel() != null) {
				txfQuickSortTroc.setText(String.valueOf(relatorioModel.getQuickSortModel().getTrocas()));
			}

			if (relatorioModel.getRadixSortModel() != null) {
				txfRadixSortTroc.setText(String.valueOf(relatorioModel.getRadixSortModel().getTrocas()));
			}
			
			if (relatorioModel.getCountingSortModel() != null) {
				txfCountingSortTroc.setText(String.valueOf(relatorioModel.getCountingSortModel().getTrocas()));
			}

		}

	}

}
