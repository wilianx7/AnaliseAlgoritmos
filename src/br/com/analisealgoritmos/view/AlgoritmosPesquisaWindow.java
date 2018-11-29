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

public class AlgoritmosPesquisaWindow extends AbstractWindowFrame {
	private static final long serialVersionUID = 8929678355717574002L;

	// Paineis.
	private JPanel panel;

	// Descri��o dos componentes.
	private JLabel descricao;

	// CheckBox Algoritmos de pesquisa.
	private JCheckBox checkPesquisaLinear;
	private JCheckBox checkPesquisaBinaria;

	// RadioButtons Tipos de caso.
	private ButtonGroup botoesCasos = new ButtonGroup();
	private JRadioButton r_BtnMelhorCaso;
	private JRadioButton r_BtnCasoMedio;
	private JRadioButton r_BtnPiorCaso;

	// CheckBox Atributos.
	private JCheckBox checkTempo;
	private JCheckBox checkComparacoes;

	// Quantidade de valores.
	private JTextField qtdValores;

	// Bot�es.
	private JButton btnRelatorio;
	private JButton btnLimpar;

//	// Relatorio.
//	private MetodosSimplesModel modelMS;
//	private RelatorioMetodosSimples relatorioMS;
//	private RelatorioSimplesModel relatorioFinal;

	// Desktop.
	private JDesktopPane desktop;

	public AlgoritmosPesquisaWindow(JDesktopPane desktop) {
		super("Algoritmos de Pesquisa");
		this.desktop = desktop;
		setBackground(new Color(250, 250, 250));
		setLayout(null);

		criarComponentes();
	}

	private void criarComponentes() {

		// Painel Algoritmos de Pesquisa.
		panel = new JPanel();
		panel.setBounds(new Rectangle(130, 30, 250, 150));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Algoritmos de Pesquisa"));
		getContentPane().add(panel);

		// CheckBox Pesquisa Linear.
		checkPesquisaLinear = new JCheckBox();
		checkPesquisaLinear.setBackground(Color.WHITE);
		checkPesquisaLinear.setBounds(10, 20, 20, 25);
		panel.add(checkPesquisaLinear);

		descricao = new JLabel("Pesquisa Linear");
		descricao.setBounds(32, 20, 200, 25);
		panel.add(descricao);

		// CheckBox Pesquisa Bin�ria.
		checkPesquisaBinaria = new JCheckBox();
		checkPesquisaBinaria.setBackground(Color.WHITE);
		checkPesquisaBinaria.setBounds(10, 50, 20, 25);
		panel.add(checkPesquisaBinaria);

		descricao = new JLabel("Pesquisa Bin�ria");
		descricao.setBounds(32, 50, 200, 25);
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

		// RadioButton Caso M�dio.
		r_BtnCasoMedio = new JRadioButton("Caso M�dio");
		r_BtnCasoMedio.setBackground(Color.WHITE);
		r_BtnCasoMedio.setBounds(10, 50, 20, 25);
		botoesCasos.add(r_BtnCasoMedio);
		panel.add(r_BtnCasoMedio);

		descricao = new JLabel("Caso M�dio");
		descricao.setBounds(32, 50, 200, 25);
		panel.add(descricao);

		// RadioButton Pior Caso.
		r_BtnPiorCaso = new JRadioButton("Pior M�dio");
		r_BtnPiorCaso.setBackground(Color.WHITE);
		r_BtnPiorCaso.setBounds(10, 80, 20, 25);
		botoesCasos.add(r_BtnPiorCaso);
		panel.add(r_BtnPiorCaso);

		descricao = new JLabel("Pior Caso");
		descricao.setBounds(32, 80, 200, 25);
		panel.add(descricao);

		// Painel Atributos.
		panel = new JPanel();
		panel.setBounds(new Rectangle(130, 230, 250, 150));
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

		// CheckBox Compara��es.
		checkComparacoes = new JCheckBox();
		checkComparacoes.setBackground(Color.WHITE);
		checkComparacoes.setBounds(10, 50, 20, 25);
		panel.add(checkComparacoes);

		descricao = new JLabel("Compara��es");
		descricao.setBounds(32, 50, 200, 25);
		panel.add(descricao);

		// Painel Valores.
		panel = new JPanel();
		panel.setBounds(new Rectangle(430, 230, 250, 150));
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

		// Bot�o Gerar Relat�rio.
		btnRelatorio = new JButton(new AbstractAction("Gerar Relat�rio") {
			private static final long serialVersionUID = -4063844540853297599L;

			@Override
			public void actionPerformed(ActionEvent e) {

				String validacao = validarGeracaoRelatorio();

				if (!validacao.equals("")) {
					JOptionPane.showMessageDialog(rootPane, validacao, "", JOptionPane.ERROR_MESSAGE, null);
				} else {

					// Determina o tipo de caso escolhido.
//					int tipoCaso;
//
//					if (r_BtnMelhorCaso.isSelected()) {
//						tipoCaso = 1;
//					} else if (r_BtnCasoMedio.isSelected()) {
//						tipoCaso = 2;
//					} else {
//						tipoCaso = 3;
//					}

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
		btnRelatorio.setBounds(132, 400, 130, 25);
		getContentPane().add(btnRelatorio);

		// Bot�o Limpar.
		btnLimpar = new JButton(new AbstractAction("Limpar") {
			private static final long serialVersionUID = 5137482096372954376L;

			@Override
			public void actionPerformed(ActionEvent e) {
				limparSelecoes();
			}
		});
		btnLimpar.setToolTipText("Limpa todas as sele��es");
		btnLimpar.setBounds(280, 400, 130, 25);
		getContentPane().add(btnLimpar);

	}

	// Limpa todas as informa��es setadas na tela.
	public void limparSelecoes() {

		checkPesquisaLinear.setSelected(false);
		checkPesquisaBinaria.setSelected(false);

		checkComparacoes.setSelected(false);
		checkTempo.setSelected(false);

		botoesCasos.clearSelection();

		qtdValores.setText("");
	}

	// Faz a valida��o ao clicar em gerar relat�rio.
	public String validarGeracaoRelatorio() {

		if (!checkPesquisaLinear.isSelected() && !checkPesquisaBinaria.isSelected()) {
			return "Selecione pelo menos um algoritmo de pesquisa";
		} else if (!r_BtnMelhorCaso.isSelected() && !r_BtnCasoMedio.isSelected() && !r_BtnPiorCaso.isSelected()) {
			return "Selecione um tipo de caso";
		} else if (!checkTempo.isSelected() && !checkComparacoes.isSelected()) {
			return "Selecione pelo menos um atributo";
		} else if (qtdValores.getText().isEmpty()) {
			return "Digite a quantidade de valores";
		} else if (qtdValores.getText().contains(".") || qtdValores.getText().contains(",")) {
			return "O campo 'Quantidade de Valores' n�o pode conter v�rgulas ou pontos";
		} else if (verificarLetras(qtdValores.getText())) {
			return "O campo 'Quantidade de Valores' n�o pode conter letras";
		} else if (Integer.parseInt(qtdValores.getText()) <= 0) {
			return "O campo 'Quantidade de Valores' n�o pode conter n�meros negativos ou iguais a 0.";
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
