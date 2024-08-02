package com.rivera.resistorcalc;

public class ResistanceCalculator {
	
	protected Codes.DColors b1;
	protected Codes.DColors b2;
	protected Codes.DColors b3;
	protected Codes.MColors mul;
	protected Codes.TColors tol;
	
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
		
	}
	
	private void valuesChanged() {
		
		
		
	}
	
	interface IResistanceChangeListener {
		void onResistanceChange(double Resistance, double minRes, double maxRes, double tolerance);
	}

}
