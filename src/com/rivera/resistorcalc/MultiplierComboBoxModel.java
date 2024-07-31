package com.rivera.resistorcalc;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import com.rivera.resistorcalc.Codes.MColors;

public class MultiplierComboBoxModel implements ComboBoxModel<Codes.MColors>{
	
	protected Codes.MColors selected = Codes.MColors.BLACK;
	
	@Override
	public int getSize() {
		return Codes.MColors.values().length;
	}

	@Override
	public MColors getElementAt(int index) {
		return Codes.MColors.values()[index];
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
		selected = (MColors)anItem;
	}

	@Override
	public Object getSelectedItem() {
		return selected;
	}
	
}
