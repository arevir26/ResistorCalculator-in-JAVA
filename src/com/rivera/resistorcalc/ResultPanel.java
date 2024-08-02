package com.rivera.resistorcalc;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel{
	

	protected JLabel lResistance;
	protected JLabel lTolerance;
	protected JLabel resistance;
	protected JLabel tolerance;
	protected GridBagLayout layout;
	protected GridBagConstraints cons;
	
	public ResultPanel() {
		lResistance = new JLabel("Resistance: ");
		lTolerance = new JLabel("Tolerance:");
		resistance = new JLabel("1 ohm");
		tolerance = new JLabel("5%");
		
		
		this.setBackground(Color.white);
		
		layout = new GridBagLayout();
		cons = new GridBagConstraints();
		
		cons.gridx = 0;
		cons.gridy = 0;
		cons.gridheight = 1;
		cons.gridwidth = 1;
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.insets = new Insets(0, 5, 0, 5);
		
		this.setLayout(layout);
		this.add(lResistance, cons);
		lResistance.setHorizontalAlignment(JLabel.RIGHT);

		
		cons.gridx = 1;
		cons.gridy = 0;
		this.add(resistance, cons);
		
		cons.gridx= 0;
		cons.gridy = 1;
		lTolerance.setHorizontalAlignment(JLabel.RIGHT);
		this.add(lTolerance, cons);
		
		
		cons.gridx = 1;
		this.add(tolerance, cons);
		
	}
	

}
