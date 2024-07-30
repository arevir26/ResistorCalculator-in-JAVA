package com.rivera.resistorcalc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class InputPanel extends JPanel {
	
	
	
	protected JComboBox<Codes.DColors> b1, b2, b3;
	protected JComboBox<Codes.MColors> multiplier;
	protected JComboBox<Codes.TColors> tolerance;
	
	public InputPanel() {
		initialize();
		initLayout();
	}
	
	private void initialize() {
		
		this.setLayout(new GridBagLayout());
		
		b1 = new JComboBox<Codes.DColors>();
		b2 = new JComboBox<Codes.DColors>();
		b3 = new JComboBox<Codes.DColors>();
		multiplier = new JComboBox<Codes.MColors>();
		tolerance = new JComboBox<Codes.TColors>();
	}
	
	private void initLayout() {
		GridBagConstraints cons = new GridBagConstraints();
		
		cons.gridheight = 1;
		cons.gridwidth = 1;
		cons.gridx = 0;
		cons.gridy = 0;
		
		add(b1, cons);
	}

}
