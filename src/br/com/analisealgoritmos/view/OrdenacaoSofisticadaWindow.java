package br.com.analisealgoritmos.view;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class OrdenacaoSofisticadaWindow  extends AbstractWindowFrame {
	private static final long serialVersionUID = -8529821438611858336L;

	// Paineis.
	private JPanel panel;

	// Descrição dos componentes.
	private JLabel descricao;

	// CheckBox Algoritmos de ordenação.
	private JCheckBox checkMergeSort;
	private JCheckBox checkHeapSort;
	private JCheckBox checkQuickSort;
	private JCheckBox checkRadixSort;
	private JCheckBox checkTimSort;
	private JCheckBox checkCountingSort;
	
	// RadioButtons Tipos de caso.
	private ButtonGroup botoesCasos = new ButtonGroup();
	private JRadioButton r_BtnMelhorCaso;
	private JRadioButton r_BtnCasoMedio;
	private JRadioButton r_BtnPiorCaso;

	// CheckBox Atributos.
	private JCheckBox checkTempo;
	private JCheckBox checkComparacoes;
	private JCheckBox checkTrocas;

	// Quantidade de valores.
	private JTextField qtdValores;

	// Botões.
	private JButton btnRelatorio;
	private JButton btnLimpar;

	// Relatorio.
//	private MetodosSimplesModel modelMS;
//	private RelatorioMetodosSimples relatorioMS;
//	private RelatorioModel relatorioFinal;

	// Desktop.
	private JDesktopPane desktop;

	public OrdenacaoSofisticadaWindow(JDesktopPane desktop) {		
			super("Algoritmos de Ordenação Sofisticados");
			this.desktop = desktop;
			setBackground(new Color(250, 250, 250));
			criarComponentes();
		}

	private void criarComponentes() {

		// Painel Algoritmos de Ordenação.
		panel = new JPanel();
		panel.setBounds(new Rectangle(130, 30, 250, 210));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Algoritmos de Ordenação"));
		getContentPane().add(panel);

		// CheckBox Merge Sort.
		checkMergeSort = new JCheckBox();
		checkMergeSort.setBackground(Color.WHITE);
		checkMergeSort.setBounds(10, 20, 20, 25);
		panel.add(checkMergeSort);

		descricao = new JLabel("Merge Sort");
		descricao.setBounds(32, 20, 200, 25);
		panel.add(descricao);

		// CheckBox Heap Sort.
		checkHeapSort = new JCheckBox();
		checkHeapSort.setBackground(Color.WHITE);
		checkHeapSort.setBounds(10, 50, 20, 25);
		panel.add(checkHeapSort);

		descricao = new JLabel("Heap Sort");
		descricao.setBounds(32, 50, 200, 25);
		panel.add(descricao);

		// CheckBox Quick Sort.
		checkQuickSort = new JCheckBox();
		checkQuickSort.setBackground(Color.WHITE);
		checkQuickSort.setBounds(10, 80, 20, 25);
		panel.add(checkQuickSort);

		descricao = new JLabel("Quick Sort");
		descricao.setBounds(32, 80, 200, 25);
		panel.add(descricao);

		// CheckBox Radix Sort.
		checkRadixSort = new JCheckBox();
		checkRadixSort.setBackground(Color.WHITE);
		checkRadixSort.setBounds(10, 110, 20, 25);
		panel.add(checkRadixSort);

		descricao = new JLabel("Radix Sort");
		descricao.setBounds(32, 110, 200, 25);
		panel.add(descricao);
		
		// CheckBox Tim Sort.
		checkTimSort = new JCheckBox();
		checkTimSort.setBackground(Color.WHITE);
		checkTimSort.setBounds(10, 140, 20, 25);
		panel.add(checkTimSort);

		descricao = new JLabel("Tim Sort");
		descricao.setBounds(32, 140, 200, 25);
		panel.add(descricao);
		
		// CheckBox Counting Sort.
		checkCountingSort = new JCheckBox();
		checkCountingSort.setBackground(Color.WHITE);
		checkCountingSort.setBounds(10, 170, 20, 25);
		panel.add(checkCountingSort);

		descricao = new JLabel("Counting Sort");
		descricao.setBounds(32, 170, 200, 25);
		panel.add(descricao);

		// Painel Tipo de Caso
		panel = new JPanel();
		panel.setBounds(new Rectangle(430, 30, 250, 150));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Tipos de Caso"));
		getContentPane().add(panel);

		// RadioButton Melhor Caso.
		r_BtnMelhorCaso = new JRadioButton("Melhor Caso");
		r_BtnMelhorCaso.setBackground(Color.WHITE);
		r_BtnMelhorCaso.setBounds(10, 20, 20, 25);
		botoesCasos.add(r_BtnMelhorCaso);
		panel.add(r_BtnMelhorCaso);

		descricao = new JLabel("Melhor Caso");
		descricao.setBounds(32, 20, 200, 25);
		panel.add(descricao);

		// RadioButton Caso Médio.
		r_BtnCasoMedio = new JRadioButton("Caso Médio");
		r_BtnCasoMedio.setBackground(Color.WHITE);
		r_BtnCasoMedio.setBounds(10, 50, 20, 25);
		botoesCasos.add(r_BtnCasoMedio);
		panel.add(r_BtnCasoMedio);

		descricao = new JLabel("Caso Médio");
		descricao.setBounds(32, 50, 200, 25);
		panel.add(descricao);

		// RadioButton Pior Caso.
		r_BtnPiorCaso = new JRadioButton("Pior Médio");
		r_BtnPiorCaso.setBackground(Color.WHITE);
		r_BtnPiorCaso.setBounds(10, 80, 20, 25);
		botoesCasos.add(r_BtnPiorCaso);
		panel.add(r_BtnPiorCaso);

		descricao = new JLabel("Pior Caso");
		descricao.setBounds(32, 80, 200, 25);
		panel.add(descricao);

		// Painel Atributos.
		panel = new JPanel();
		panel.setBounds(new Rectangle(130, 270, 250, 150));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Atributos"));
		getContentPane().add(panel);

		// CheckBox Tempo.
		checkTempo = new JCheckBox();
		checkTempo.setBackground(Color.WHITE);
		checkTempo.setBounds(10, 20, 20, 25);
		panel.add(checkTempo);

		descricao = new JLabel("Tempo");
		descricao.setBounds(32, 20, 200, 25);
		panel.add(descricao);

		// CheckBox Comparações.
		checkComparacoes = new JCheckBox();
		checkComparacoes.setBackground(Color.WHITE);
		checkComparacoes.setBounds(10, 50, 20, 25);
		panel.add(checkComparacoes);

		descricao = new JLabel("Comparações");
		descricao.setBounds(32, 50, 200, 25);
		panel.add(descricao);

		// CheckBox Trocas.
		checkTrocas = new JCheckBox();
		checkTrocas.setBackground(Color.WHITE);
		checkTrocas.setBounds(10, 80, 20, 25);
		panel.add(checkTrocas);

		descricao = new JLabel("Trocas");
		descricao.setBounds(32, 80, 200, 25);
		panel.add(descricao);

		// Painel Valores.
		panel = new JPanel();
		panel.setBounds(new Rectangle(430, 270, 250, 150));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Valores"));
		getContentPane().add(panel);

		// Quantidade de Valores.
		descricao = new JLabel("Quantidade de Valores:");
		descricao.setBounds(10, 20, 200, 25);
		panel.add(descricao);

		qtdValores = new JTextField();
		qtdValores.setBounds(10, 45, 135, 25);
		panel.add(qtdValores);

		// Botão Gerar Relatório.
		btnRelatorio = new JButton(new AbstractAction("Gerar Relatório") {
			private static final long serialVersionUID = -4063844540853297599L;

			@Override
			public void actionPerformed(ActionEvent e) {

				String validacao = validarGeracaoRelatorio();

				if (!validacao.equals("")) {
					JOptionPane.showMessageDialog(rootPane, validacao, "", JOptionPane.ERROR_MESSAGE, null);
				} else {

					// Determina o tipo de caso escolhido.
					int tipoCaso;

					if (r_BtnMelhorCaso.isSelected()) {
						tipoCaso = 1;
					} else if (r_BtnCasoMedio.isSelected()) {
						tipoCaso = 2;
					} else {
						tipoCaso = 3;
					}

					// Constroi o modelo a partir dos dados setados na tela.
//					modelMS = new MetodosSimplesModel(checkInsertionSort.isSelected(), checkSelectionSort.isSelected(),
//							checkBubbleSort.isSelected(), checkCombSort.isSelected(), checkTempo.isSelected(),
//							checkComparacoes.isSelected(), checkTrocas.isSelected(), tipoCaso,
//							Integer.parseInt(qtdValores.getText()));
//
//					relatorioMS = new RelatorioMetodosSimples(modelMS);
//					relatorioFinal = relatorioMS.getRelatorioFinal();
//					relatorioFinal.setTempo(checkTempo.isSelected());
//					relatorioFinal.setTrocas(checkTrocas.isSelected());
//					relatorioFinal.setComparacoes(checkComparacoes.isSelected());
//
//					RelatorioSimplesWindow relatorioSimplesWindow = new RelatorioSimplesWindow(relatorioFinal);
//					abrirFrame(relatorioSimplesWindow);
				}
			}
		});
		btnRelatorio.setBounds(132, 440, 130, 25);
		getContentPane().add(btnRelatorio);

		// Botão Limpar.
		btnLimpar = new JButton(new AbstractAction("Limpar") {
			private static final long serialVersionUID = 5137482096372954376L;

			@Override
			public void actionPerformed(ActionEvent e) {
				limparSelecoes();
			}
		});
		btnLimpar.setToolTipText("Limpa todas as seleções");
		btnLimpar.setBounds(280, 440, 130, 25);
		getContentPane().add(btnLimpar);
	}

	// Limpa todas as informações setadas na tela.
	public void limparSelecoes() {

		checkMergeSort.setSelected(false);
		checkHeapSort.setSelected(false);
		checkQuickSort.setSelected(false);
		checkRadixSort.setSelected(false);
		checkTimSort.setSelected(false);
		checkCountingSort.setSelected(false);

		checkComparacoes.setSelected(false);
		checkTrocas.setSelected(false);
		checkTempo.setSelected(false);

		botoesCasos.clearSelection();

		qtdValores.setText("");
	}

	// Faz a validação ao clicar em gerar relatório.
	public String validarGeracaoRelatorio() {

		if (!checkMergeSort.isSelected() && !checkHeapSort.isSelected() && !checkQuickSort.isSelected()
				&& !checkQuickSort.isSelected() && !checkRadixSort.isSelected() && !checkTimSort.isSelected()
				&& !checkCountingSort.isSelected()) {
			return "Selecione pelo menos um algoritmo de ordenação";
		} else if (!r_BtnMelhorCaso.isSelected() && !r_BtnCasoMedio.isSelected() && !r_BtnPiorCaso.isSelected()) {
			return "Selecione um tipo de caso";
		} else if (!checkTempo.isSelected() && !checkTrocas.isSelected() && !checkComparacoes.isSelected()) {
			return "Selecione pelo menos um atributo";
		} else if (qtdValores.getText().isEmpty()) {
			return "Digite a quantidade de valores";
		} else if (qtdValores.getText().contains(".") || qtdValores.getText().contains(",")) {
			return "O campo 'Quantidade de Valores' não pode conter vírgulas ou pontos";
		} else if (verificarLetras(qtdValores.getText())) {
			return "O campo 'Quantidade de Valores' não pode conter letras";
		} else if (Integer.parseInt(qtdValores.getText()) <= 0) {
			return "O campo 'Quantidade de Valores' não pode conter números negativos ou iguais a 0.";
		}

		return "";
	}

	// Verifica se uma determinada string possui letras.
	private boolean verificarLetras(String texto) {

		for (int i = 0; i < texto.length(); i++) {
			if (Character.isLetter(texto.charAt(i))) {
				return true;
			}
		}

		return false;
	}

	private void abrirFrame(AbstractWindowFrame frame) {
		desktop.add(frame);

		frame.showFrame();
	}
}
