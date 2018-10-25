package br.com.analisealgoritmos.view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;

public class AbstractWindowFrame extends JInternalFrame {
	private static final long serialVersionUID = -3628819145738314811L;

	public AbstractWindowFrame(String nomeTela) {
	    super(nomeTela, false, true, false, false);
		
	    setLayout(null);
	    setVisible(true);
	    setBorder(null);
	   
	    //Seta tamanho
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(new Rectangle(0, 0, screenSize.width, screenSize.height));
	    
	}
			
}
