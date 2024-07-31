package com.rivera.resistorcalc;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InputPanel extends JPanel {
	
	protected ButtonGroup bandSelection;
	protected JRadioButton fourBands, fiveBands;
	
	protected JComboBox<Codes.DColors> b1, b2, b3;
	protected JComboBox<Codes.MColors> multiplier;
	protected JComboBox<Codes.TColors> tolerance;
	
	public InputPanel() {
		initialize();
		initLayout();
		
		b1.setModel(new DigitComboBoxModel());
		b2.setModel(new DigitComboBoxModel());
		b3.setModel(new DigitComboBoxModel());
		multiplier.setModel(new MultiplierComboBoxModel());
		tolerance.setModel(new ToleranceComboBoxModel());
		
	}
	
	private void initialize() {
		
		this.setLayout(new GridBagLayout());
		
		b1 = new JComboBox<Codes.DColors>();
		b1.setBackground(Color.white);
		b2 = new JComboBox<Codes.DColors>();
		b2.setBackground(Color.white);
		b3 = new JComboBox<Codes.DColors>();
		b3.setBackground(Color.white);
		multiplier = new JComboBox<Codes.MColors>();
		multiplier.setBackground(Color.white);
		tolerance = new JComboBox<Codes.TColors>();
		tolerance.setBackground(Color.white);
		bandSelection = new ButtonGroup();
		
		fourBands = new JRadioButton();
		fourBands.setSelected(true);
		fourBands.setText("Four");
		fiveBands = new JRadioButton();
		fiveBands.setText("Five");
		
		bandSelection.add(fourBands);
		bandSelection.add(fiveBands);
		
		
	}
	
	private void initLayout() {
		GridBagConstraints cons = new GridBagConstraints();
		
		setBackground(Color.white);
		
		
		
		cons.gridheight = 1;
		cons.gridwidth = 1;
		cons.gridx = 0;
		cons.gridy = 0;
		cons.insets = new Insets(10, 10, 10, 10);
		
		add(new JLabel("Bands: "), cons);
		
		cons.gridx = 1;
		add(fourBands, cons);
		
		cons.gridx = 2;
		add(fiveBands, cons);
		
		cons.gridy = 1;
		cons.gridx = 0;
		add(b1, cons);
		
		cons.gridx = 1;
		add(b2, cons);
		
		cons.gridx = 2;
		add(b3, cons);
		
		cons.gridx = 4;
		add(multiplier,cons);
		
		cons.gridx = 5;
		add(tolerance, cons);
		
		
	}

}
