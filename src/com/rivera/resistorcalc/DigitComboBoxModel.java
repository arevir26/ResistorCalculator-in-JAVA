package com.rivera.resistorcalc;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import com.rivera.resistorcalc.Codes.DColors;

public class DigitComboBoxModel implements ComboBoxModel<Codes.DColors> {
	
	Codes.DColors selected = Codes.DColors.values()[0];

	@Override
	public int getSize() {
		return Codes.DColors.values().length;
	}

	@Override
	public DColors getElementAt(int index) {
		return Codes.DColors.values()[index];
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		selected = (DColors)anItem;
	}

	@Override
	public Object getSelectedItem() {
		return selected;
	}
	
	
	

}
