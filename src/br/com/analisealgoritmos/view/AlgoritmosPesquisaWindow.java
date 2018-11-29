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

import br.com.analisealgoritmos.model.AlgoritmosPesquisaModel;
import br.com.analisealgoritmos.model.RelatorioPesquisaModel;
import br.com.analisealgoritmos.report.RelatorioPesquisa;

public class AlgoritmosPesquisaWindow extends AbstractWindowFrame {
	private static final long serialVersionUID = 8929678355717574002L;

	// Paineis.
	private JPanel panel;

	// Descrição dos componentes.
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
	private JTextField valorAlvo;

	// Botões.
	private JButton btnRelatorio;
	private JButton btnLimpar;

//	// Relatorio.
	private AlgoritmosPesquisaModel modelPesquisa;
	private RelatorioPesquisa relatorioPesquisa;
	private RelatorioPesquisaModel relatorioFinal;

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

		// CheckBox Pesquisa Binária.
		checkPesquisaBinaria = new JCheckBox();
		checkPesquisaBinaria.setBackground(Color.WHITE);
		checkPesquisaBinaria.setBounds(10, 50, 20, 25);
		panel.add(checkPesquisaBinaria);

		descricao = new JLabel("Pesquisa Binária");
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

		// CheckBox Comparações.
		checkComparacoes = new JCheckBox();
		checkComparacoes.setBackground(Color.WHITE);
		checkComparacoes.setBounds(10, 50, 20, 25);
		panel.add(checkComparacoes);

		descricao = new JLabel("Comparações");
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

		// Valor Alvo.
		descricao = new JLabel("Valor Procurado:");
		descricao.setBounds(10, 75, 200, 25);
		panel.add(descricao);

		valorAlvo = new JTextField();
		valorAlvo.setBounds(10, 100, 135, 25);
		panel.add(valorAlvo);

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
					modelPesquisa = new AlgoritmosPesquisaModel(checkPesquisaLinear.isSelected(),
							checkPesquisaBinaria.isSelected(), checkTempo.isSelected(), checkComparacoes.isSelected(),
							tipoCaso, Integer.parseInt(qtdValores.getText()), Integer.parseInt(valorAlvo.getText()));

					relatorioPesquisa = new RelatorioPesquisa(modelPesquisa);
					relatorioFinal = relatorioPesquisa.getRelatorioFinal();
					relatorioFinal.setValorAlvo(Integer.parseInt(valorAlvo.getText()));
					relatorioFinal.setTempo(checkTempo.isSelected());
					relatorioFinal.setComparacoes(checkComparacoes.isSelected());

					RelatorioPesquisaWindow relatorioPesquisaWindow = new RelatorioPesquisaWindow(relatorioFinal);
					abrirFrame(relatorioPesquisaWindow);
				}
			}
		});
		btnRelatorio.setBounds(132, 400, 130, 25);
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
		btnLimpar.setBounds(280, 400, 130, 25);
		getContentPane().add(btnLimpar);

	}

	// Limpa todas as informações setadas na tela.
	public void limparSelecoes() {

		checkPesquisaLinear.setSelected(false);
		checkPesquisaBinaria.setSelected(false);

		checkComparacoes.setSelected(false);
		checkTempo.setSelected(false);

		botoesCasos.clearSelection();

		qtdValores.setText("");
	}

	// Faz a validação ao clicar em gerar relatório.
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
			return "O campo 'Quantidade de Valores' não pode conter vírgulas ou pontos";
		} else if (verificarLetras(qtdValores.getText())) {
			return "O campo 'Quantidade de Valores' não pode conter letras";
		} else if (Integer.parseInt(qtdValores.getText()) <= 0) {
			return "O campo 'Quantidade de Valores' não pode conter números negativos ou iguais a 0.";
		} else if(valorAlvo.getText().isEmpty()) {
			return "Digite o valor a ser pesquisado";
		} else if (verificarLetras(valorAlvo.getText())) {
			return "O campo 'Valor Procurado' não pode conter letras";
		} else if (checkPesquisaBinaria.isSelected() && r_BtnCasoMedio.isSelected() ||
				checkPesquisaBinaria.isSelected() && r_BtnPiorCaso.isSelected()) {
			return "A pesquisa binária só pode ser utilizada para o melhor caso";
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
