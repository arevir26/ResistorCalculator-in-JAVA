package com.rivera.resistorcalc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import com.rivera.resistorcalc.Codes.DColors;
import com.rivera.resistorcalc.Codes.MColors;
import com.rivera.resistorcalc.Codes.TColors;
import com.rivera.resistorcalc.InputPanel.InputChangeListener;

public class MainPanel extends JPanel{
	
	protected CanvasPanel cpanel;
	protected InputPanel ipanel;
	protected ResultPanel rpanel;
	GridBagLayout layout;
	
	ResistanceCalculator calculator;
	InputChangeListener inputlistener;
	
	
	public MainPanel() {
		calculator = new ResistanceCalculator();
		initializeLayout();
		inputlistener = new InputChangeListener() {
			
			@Override
			public void onInputChange(Mode mode, DColors d1, DColors d2, DColors d3, MColors mul, TColors tol) {
				calculator.setValues(d1, d2, d3, mul, tol);
			}
		};
		ipanel.addInputChangeListener(inputlistener);
		
		calculator.addListener(rpanel);
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
		
		rpanel = new ResultPanel();
		cons.gridy = 1;
		this.add(rpanel, cons);
		
		ipanel = new InputPanel();
		
		cons.gridy = 2;
		this.add(ipanel, cons);
		
		
		
	}
}
