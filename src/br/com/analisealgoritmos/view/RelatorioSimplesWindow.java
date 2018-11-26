package br.com.analisealgoritmos.view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.analisealgoritmos.model.RelatorioSimplesModel;

public class RelatorioSimplesWindow extends AbstractWindowFrame {
	private static final long serialVersionUID = -233330532072167956L;

	//Paineis.
	private JPanel panel;
	
	//Descrição dos componentes.
	private JLabel descricao;
	
	//JTextFields Tempos.
	private JTextField txfInsertionSortTemp;
	private JTextField txfBubbleSortTemp;
	private JTextField txfSelectionSortTemp;
	private JTextField txfCombSortTemp;
	
	//JTextFields Comparações.
	private JTextField txfInsertionSortComp;
	private JTextField txfBubbleSortComp;
	private JTextField txfSelectionSortComp;
	private JTextField txfCombSortComp;
	
	//JTextFields Trocas.
	private JTextField txfInsertionSortTroc;
	private JTextField txfBubbleSortTroc;
	private JTextField txfSelectionSortTroc;
	private JTextField txfCombSortTroc;
	
	//Dados para o relatório.
	private RelatorioSimplesModel relatorioModel;

	public RelatorioSimplesWindow(RelatorioSimplesModel relatorioModel) {		
		super("Relatório Métodos Simples");
		setBackground(new Color(250, 250, 250));
		this.relatorioModel = relatorioModel;
		criarComponentes();
		inserirDados();
	}
	
	private void criarComponentes() {
		
		//Painel Tempos.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 20, 450, 190));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Tempos (ms) (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panel);		
		
		//Tempo Insertion Sort.
		descricao = new JLabel("Insertion Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panel.add(descricao);
		
		txfInsertionSortTemp = new JTextField();
		txfInsertionSortTemp.setEditable(false);
		txfInsertionSortTemp.setBackground(new Color(250, 250, 250));
		txfInsertionSortTemp.setBounds(105, 20, 160, 25);
		panel.add(txfInsertionSortTemp);		
		
		descricao = new JLabel("ms");
		descricao.setBounds(275, 20, 120, 25);
		panel.add(descricao);
		
		//Tempo Bubble Sort.
		descricao = new JLabel("Bubble Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panel.add(descricao);
		
		txfBubbleSortTemp = new JTextField();
		txfBubbleSortTemp.setEditable(false);
		txfBubbleSortTemp.setBackground(new Color(250, 250, 250));
		txfBubbleSortTemp.setBounds(105, 65, 160, 25);
		panel.add(txfBubbleSortTemp);		
		
		descricao = new JLabel("ms");
		descricao.setBounds(275, 65, 120, 25);
		panel.add(descricao);
		
		//Tempo Selection Sort.
		descricao = new JLabel("Selection Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panel.add(descricao);
		
		txfSelectionSortTemp = new JTextField();
		txfSelectionSortTemp.setEditable(false);
		txfSelectionSortTemp.setBackground(new Color(250, 250, 250));
		txfSelectionSortTemp.setBounds(105, 110, 160, 25);
		panel.add(txfSelectionSortTemp);		
		
		descricao = new JLabel("ms");
		descricao.setBounds(275, 110, 120, 25);
		panel.add(descricao);
		
		//Tempo Comb Sort.
		descricao = new JLabel("Comb Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panel.add(descricao);
				
		txfCombSortTemp = new JTextField();
		txfCombSortTemp.setEditable(false);
		txfCombSortTemp.setBackground(new Color(250, 250, 250));
		txfCombSortTemp.setBounds(105, 155, 160, 25);
		panel.add(txfCombSortTemp);		
				
		descricao = new JLabel("ms");
		descricao.setBounds(275, 155, 120, 25);
		panel.add(descricao);
		
		//Painel Comparações.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 230, 450, 190));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Comparações (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panel);		
		
		//Comparações Insertion Sort.
		descricao = new JLabel("Insertion Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panel.add(descricao);
		
		txfInsertionSortComp = new JTextField();
		txfInsertionSortComp.setEditable(false);
		txfInsertionSortComp.setBackground(new Color(250, 250, 250));
		txfInsertionSortComp.setBounds(105, 20, 160, 25);
		panel.add(txfInsertionSortComp);
		
		//Comparações Bubble Sort.
		descricao = new JLabel("Bubble Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panel.add(descricao);
		
		txfBubbleSortComp = new JTextField();
		txfBubbleSortComp.setEditable(false);
		txfBubbleSortComp.setBackground(new Color(250, 250, 250));
		txfBubbleSortComp.setBounds(105, 65, 160, 25);
		panel.add(txfBubbleSortComp);
		
		//Comparações Selection Sort.
		descricao = new JLabel("Selection Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panel.add(descricao);
		
		txfSelectionSortComp = new JTextField();
		txfSelectionSortComp.setEditable(false);
		txfSelectionSortComp.setBackground(new Color(250, 250, 250));
		txfSelectionSortComp.setBounds(105, 110, 160, 25);
		panel.add(txfSelectionSortComp);
		
		//Comparações Comb Sort.
		descricao = new JLabel("Comb Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panel.add(descricao);
				
		txfCombSortComp = new JTextField();
		txfCombSortComp.setEditable(false);
		txfCombSortComp.setBackground(new Color(250, 250, 250));
		txfCombSortComp.setBounds(105, 155, 160, 25);
		panel.add(txfCombSortComp);		
		
		//Painel Trocas.
		panel = new JPanel();
		panel.setBounds(new Rectangle(175, 440, 450, 190));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Trocas (" + relatorioModel.getQtdValores() + " Valores)"));
		getContentPane().add(panel);
		
		//Trocas Insertion Sort.
		descricao = new JLabel("Insertion Sort:");
		descricao.setBounds(15, 20, 120, 25);
		panel.add(descricao);
		
		txfInsertionSortTroc = new JTextField();
		txfInsertionSortTroc.setEditable(false);
		txfInsertionSortTroc.setBackground(new Color(250, 250, 250));
		txfInsertionSortTroc.setBounds(105, 20, 160, 25);
		panel.add(txfInsertionSortTroc);
						
		//Trocas Bubble Sort.
		descricao = new JLabel("Bubble Sort:");
		descricao.setBounds(15, 65, 120, 25);
		panel.add(descricao);
						
		txfBubbleSortTroc = new JTextField();
		txfBubbleSortTroc.setEditable(false);
		txfBubbleSortTroc.setBackground(new Color(250, 250, 250));
		txfBubbleSortTroc.setBounds(105, 65, 160, 25);
		panel.add(txfBubbleSortTroc);
						
		//Trocas Selection Sort.
		descricao = new JLabel("Selection Sort:");
		descricao.setBounds(15, 110, 120, 25);
		panel.add(descricao);
						
		txfSelectionSortTroc = new JTextField();
		txfSelectionSortTroc.setEditable(false);
		txfSelectionSortTroc.setBackground(new Color(250, 250, 250));
		txfSelectionSortTroc.setBounds(105, 110, 160, 25);
		panel.add(txfSelectionSortTroc);
						
		//Trocas Comb Sort.
		descricao = new JLabel("Comb Sort:");
		descricao.setBounds(15, 155, 120, 25);
		panel.add(descricao);
								
		txfCombSortTroc = new JTextField();
		txfCombSortTroc.setEditable(false);
		txfCombSortTroc.setBackground(new Color(250, 250, 250));
		txfCombSortTroc.setBounds(105, 155, 160, 25);
		panel.add(txfCombSortTroc);
	}
	
	public void inserirDados() {
		
		//Tempos.
		if(relatorioModel.isTempo()) {
			
			if(relatorioModel.getInsertionSortModel() != null) {
				txfInsertionSortTemp.setText(String.valueOf(relatorioModel.getInsertionSortModel().getTempo()));
			}
			
			if(relatorioModel.getBubbleSortModel() != null) {
				txfBubbleSortTemp.setText(String.valueOf(relatorioModel.getBubbleSortModel().getTempo()));
			}
			
			if(relatorioModel.getSelectionSortModel() != null) {
				txfSelectionSortTemp.setText(String.valueOf(relatorioModel.getSelectionSortModel().getTempo()));
			}
			
			if(relatorioModel.getCombSortModel() != null) {
				txfCombSortTemp.setText(String.valueOf(relatorioModel.getCombSortModel().getTempo()));
			}
			
		}
		
		//Comparações.
		if(relatorioModel.isComparacoes()) {
			
			if(relatorioModel.getInsertionSortModel() != null) {
				txfInsertionSortComp.setText(String.valueOf(relatorioModel.getInsertionSortModel().getComparacoes()));
			}
			
			if(relatorioModel.getBubbleSortModel() != null) {
				txfBubbleSortComp.setText(String.valueOf(relatorioModel.getBubbleSortModel().getComparacoes()));
			}
			
			if(relatorioModel.getSelectionSortModel() != null) {
				txfSelectionSortComp.setText(String.valueOf(relatorioModel.getSelectionSortModel().getComparacoes()));
			}
			
			if(relatorioModel.getCombSortModel() != null) {
				txfCombSortComp.setText(String.valueOf(relatorioModel.getCombSortModel().getComparacoes()));
			}	
			
		}
		
		//Trocas.
		if(relatorioModel.isTrocas()) {
			
			if(relatorioModel.getInsertionSortModel() != null) {
				txfInsertionSortTroc.setText(String.valueOf(relatorioModel.getInsertionSortModel().getTrocas()));
			}
			
			if(relatorioModel.getBubbleSortModel() != null) {
				txfBubbleSortTroc.setText(String.valueOf(relatorioModel.getBubbleSortModel().getTrocas()));
			}
			
			if(relatorioModel.getSelectionSortModel() != null) {
				txfSelectionSortTroc.setText(String.valueOf(relatorioModel.getSelectionSortModel().getTrocas()));
			}
			
			if(relatorioModel.getCombSortModel() != null) {
				txfCombSortTroc.setText(String.valueOf(relatorioModel.getCombSortModel().getTrocas()));
			}
			
		}
		
	}
	
}
