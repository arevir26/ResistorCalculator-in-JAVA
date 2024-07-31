package com.rivera.resistorcalc;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
	
	protected ArrayList<InputChangeListener> changeListeners = new ArrayList<InputPanel.InputChangeListener>();
	
	GridBagConstraints cons = new GridBagConstraints();
	
	protected Mode mode = Mode.FOUR;
	
	
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
		
		fourBands.setText("Four");
		fourBands.setSelected(true);
		b1.setVisible(false); // should not be visible on four bands mode
		fiveBands = new JRadioButton();
		
		fiveBands.setText("Five");
		
		
		
		
		fourBands.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				updateMode(e);
			}
		});
		fiveBands.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				updateMode(e);
			}
		});
		
		bandSelection.add(fourBands);
		bandSelection.add(fiveBands);
		
		
		
		
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
	
	protected void updateMode(ChangeEvent e){
		
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
	}
	
	public void addInputChangeListener(InputChangeListener listener) {
		changeListeners.add(listener);
	}
	
	public void removeInputChangeListener(InputChangeListener listener) {
		changeListeners.remove(listener);
	}
	
	interface InputChangeListener {
		void onInputChange(
				Mode mode, 
				Codes.DColors b1, 
				Codes.DColors b2, 
				Codes.DColors b3,
				Codes.MColors mul,
				Codes.TColors tol);
	}

}
