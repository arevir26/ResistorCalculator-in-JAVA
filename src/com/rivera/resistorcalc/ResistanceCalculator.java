package com.rivera.resistorcalc;

import java.util.ArrayList;

public class ResistanceCalculator {
	
	protected Codes.DColors b1;
	protected Codes.DColors b2;
	protected Codes.DColors b3;
	protected Codes.MColors mul;
	protected Codes.TColors tol;
	
	protected ArrayList<IResistanceChangeListener> listeners = new ArrayList<ResistanceCalculator.IResistanceChangeListener>();
	
	public void setValues(
			Codes.DColors b1, 
			Codes.DColors b2, 
			Codes.DColors b3,
			Codes.MColors mul,
			Codes.TColors tol) {
		
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.mul = mul;
		this.tol = tol;
		
		valuesChanged();
	}
	
	public void removeListener(IResistanceChangeListener listener) {
		listeners.remove(listener);
	}
	
	public void addListener(IResistanceChangeListener listener) {
		listeners.add(listener);
	}
	
	private void valuesChanged() {
		double digit = (Codes.getCodeValue(b1) * 100) +
				(Codes.getCodeValue(b2) * 10) + Codes.getCodeValue(b3);
		double resistance = digit * Codes.getCodeValue(mul);
		double tolerance = Codes.getCodeValue(tol);
		double minRes = resistance - (tolerance * resistance);
		double maxRes = resistance + (tolerance * resistance);
		
		listeners.forEach(a->{
			a.onResistanceChange(resistance, minRes, maxRes, tolerance);
		});
		
	}
	
	interface IResistanceChangeListener {
		void onResistanceChange(double Resistance, double minRes, double maxRes, double tolerance);
	}

}
