package com.rivera.resistorcalc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	protected CanvasPanel cpanel;
	protected InputPanel ipanel;
	GridBagLayout layout;
	
	
	public MainPanel() {
		initializeLayout();
	}
	
	
	protected void initializeLayout() {
		layout = new GridBagLayout();
		this.setLayout(layout);
		
		GridBagConstraints cons = new GridBagConstraints();
		cons.gridheight = 1;
		cons.gridwidth = 1;
		cons.gridx = 0;
		cons.gridy = 0;
		cons.fill = GridBagConstraints.BOTH;
		
		cpanel = new CanvasPanel();
		this.add(cpanel,cons);
		
		ipanel = new InputPanel();
		
		cons.gridy = 1;
		this.add(ipanel, cons);
		
		
		
	}
}
