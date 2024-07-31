package com.rivera.resistorcalc;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class InputPanel extends JPanel {
	
	protected ButtonGroup bandSelection;
	protected JRadioButton fourBands, fiveBands;
	
	protected JComboBox<Codes.DColors> b1, b2, b3;
	protected JComboBox<Codes.MColors> multiplier;
	protected JComboBox<Codes.TColors> tolerance;
	GridBagConstraints cons = new GridBagConstraints();
	
	protected ArrayList<InputChangeListener> changeListeners = new ArrayList<InputPanel.InputChangeListener>();
	protected ActionListener comboBoxListener;
	
	
	// current mode
	protected Mode mode = Mode.FOUR;
	
	// Current selection
	protected Codes.DColors d1, d2, d3;
	protected Codes.MColors dmul;
	protected Codes.TColors dtol;
	
	
	
	
	
	public InputPanel() {
		initialize();
		initLayout();
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
		
		fourBands.setText("Four");
		fourBands.setSelected(true);
		b1.setVisible(false); // should not be visible on four bands mode
		fiveBands = new JRadioButton();
		
		fiveBands.setText("Five");
		
		
		fourBands.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateMode(e);
			}
		});
		fiveBands.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateMode(e);
				
			}
		});
		
		bandSelection.add(fourBands);
		bandSelection.add(fiveBands);
		
		b1.setModel(new DigitComboBoxModel());
		b2.setModel(new DigitComboBoxModel());
		b3.setModel(new DigitComboBoxModel());
		multiplier.setModel(new MultiplierComboBoxModel());
		tolerance.setModel(new ToleranceComboBoxModel());
		
		d1 = (Codes.DColors )b1.getModel().getSelectedItem();
		d2 = (Codes.DColors )b2.getModel().getSelectedItem();
		d3 = (Codes.DColors )b3.getModel().getSelectedItem();
		dmul = (Codes.MColors)multiplier.getModel().getSelectedItem();
		dtol = (Codes.TColors)tolerance.getModel().getSelectedItem();
		
		comboBoxListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				invokeListeners();
			}
		};
		b1.addActionListener(comboBoxListener);
		b2.addActionListener(comboBoxListener);
		b3.addActionListener(comboBoxListener);
		multiplier.addActionListener(comboBoxListener);
		tolerance.addActionListener(comboBoxListener);
		
	}
	
	private void initLayout() {
		
		
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
	
	protected void updateMode(ActionEvent e){
		
		JRadioButton source = (JRadioButton)e.getSource();
		if(source == fourBands && fourBands.isSelected()) {
			mode = Mode.FOUR;
		}
		if(source == fiveBands && fiveBands.isSelected()) {
			mode = Mode.FIVE;
		}
		
		
		if(mode == Mode.FOUR) {
			b1.setVisible(false);
			b1.getModel().setSelectedItem(Codes.DColors.values()[0]);
		}
		if(mode == Mode.FIVE) {
			b1.setVisible(true);
		}
		
		invokeListeners();
	}
	
	public void addInputChangeListener(InputChangeListener listener) {
		changeListeners.add(listener);
	}
	
	public void removeInputChangeListener(InputChangeListener listener) {
		changeListeners.remove(listener);
	}
	
	private void invokeListeners() {
		d1 = (Codes.DColors )b1.getModel().getSelectedItem();
		d2 = (Codes.DColors )b2.getModel().getSelectedItem();
		d3 = (Codes.DColors )b3.getModel().getSelectedItem();
		dmul = (Codes.MColors)multiplier.getModel().getSelectedItem();
		dtol = (Codes.TColors)tolerance.getModel().getSelectedItem();
		changeListeners.forEach((a)->{
			a.onInputChange(mode, d1, d2, d3, dmul, dtol);
		});
	}
	
	interface InputChangeListener {
		void onInputChange(
				Mode mode, 
				Codes.DColors d1, 
				Codes.DColors d2, 
				Codes.DColors d3,
				Codes.MColors mul,
				Codes.TColors tol);
	}

}
