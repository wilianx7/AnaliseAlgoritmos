package br.com.analisealgoritmos.view;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = 2630247367422389726L;
	
	private JMenu menuOrdenacao;
	private JMenu menuPesquisa;
	
	private OrdenacaoSimplesWindow frameOrdenacaoSimples;

	private JDesktopPane desktop;
	
	public MainWindow() {
		super();
			
		desktop = new JDesktopPane();
		desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		desktop.setVisible(true);
		setContentPane(desktop);
		inicializar(); 
	}
	
	private void inicializar() {
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Simulador de Algoritmos de Ordenação e Pesquisa");
		this.setJMenuBar(getWindowMenuBar());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setBounds(new Rectangle(0, 0, 835, 725));
		this.setFocusableWindowState(true);
	}
	
	/*
	 * MENU DE NAVEGAÇÃO
	 */
	private JMenuBar getWindowMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(getMenuOrdenacao());
		menuBar.add(getMenuPesquisa());
		return menuBar;
	}
	
	// Menu Ordenação
	private JMenu getMenuOrdenacao() {
		menuOrdenacao = new JMenu();
		menuOrdenacao.setText("Algoritmos de Ordenação");
		menuOrdenacao.setFont(getDefaultFont());
		menuOrdenacao.add(getMenuItemMetodosSimples());
		menuOrdenacao.add(getMenuItemMetodosSofisticados());

		return menuOrdenacao;
	}
	
	// Menu Pesquisa
	private JMenu getMenuPesquisa() {
		menuPesquisa = new JMenu();
		menuPesquisa.setText("Algoritmos de Pesquisa");
		menuPesquisa.setFont(getDefaultFont());
		menuPesquisa.add(getMenuItemPesquisaBinaria());
		menuPesquisa.add(getMenuItemPesquisaLinear());
		menuPesquisa.add(getMenuItemBogoBusca());		

		return menuPesquisa;
	}
	
	private JMenuItem getMenuItemMetodosSimples() {
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Métodos Simples");
		menuItem.setFont(getDefaultFont());

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameOrdenacaoSimples = new OrdenacaoSimplesWindow();
				abrirFrame(frameOrdenacaoSimples);
			}
		});

		return menuItem;
	}
	
	private JMenuItem getMenuItemMetodosSofisticados() {
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Métodos Sofisticados");
		menuItem.setFont(getDefaultFont());

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Abrir janela dos métodos de ordenação sofisticados.
				
			}
		});

		return menuItem;
	}
	
	private JMenuItem getMenuItemPesquisaBinaria() {
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Pesquisa Binária");
		menuItem.setFont(getDefaultFont());

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Abrir janela da pesquisa binária.
				
			}
		});

		return menuItem;
	}
	
	private JMenuItem getMenuItemPesquisaLinear() {
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Pesquisa Linear");
		menuItem.setFont(getDefaultFont());

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Abrir janela da pesquisa sequencial.
				
			}
		});

		return menuItem;
	}
	
	private JMenuItem getMenuItemBogoBusca() {
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Bogo Busca");
		menuItem.setFont(getDefaultFont());

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Abrir janela do bogo busca.
				
			}
		});

		return menuItem;
	}
	
	private void abrirFrame(AbstractWindowFrame frame) {		
		boolean frameJaExiste = false;

		// Percorre todos os frames adicionados
		for (JInternalFrame addedFrame : desktop.getAllFrames()) {
			// Se o frame a ser adicionado já estiver aberto
			if (addedFrame.getTitle().equals(frame.getTitle())) {				
				frame = (AbstractWindowFrame) addedFrame;
				frameJaExiste = true;

				break;
			}
		}

		try {
			if (!frameJaExiste) {
				desktop.add(frame);
			}

			frame.setSelected(true);
			frame.setMaximum(true);
			frame.setVisible(true);
		} catch (PropertyVetoException e) {
			JOptionPane.showMessageDialog(rootPane, "Houve um erro ao abrir a janela", "", JOptionPane.ERROR_MESSAGE, null);
		}
	}
	
	private Font getDefaultFont() {
		return new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12);
	}
	
	public static void main(final String[] args) {
		//Abrir janela principal no centro da tela.
		new MainWindow().setLocationRelativeTo(null);
	}

}
