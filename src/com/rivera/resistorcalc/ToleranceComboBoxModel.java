package com.rivera.resistorcalc;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import com.rivera.resistorcalc.Codes.TColors;

public class ToleranceComboBoxModel implements ComboBoxModel<Codes.TColors> {

	Codes.TColors selected = Codes.TColors.values()[0];
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return Codes.TColors.values().length;
	}

	@Override
	public TColors getElementAt(int index) {
		return Codes.TColors.values()[index];
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		selected = (Codes.TColors)anItem;
	}

	@Override
	public Object getSelectedItem() {
		return selected;
	}

}
