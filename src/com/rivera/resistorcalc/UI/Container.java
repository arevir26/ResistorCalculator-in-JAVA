package com.rivera.resistorcalc.UI;

import java.awt.Graphics;
import java.util.ArrayList;

public class Container extends Drawable{
	
	
	protected ArrayList<Drawable> child = new ArrayList<>();
	public int padding = 10;
	
	public Container(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}
	
	
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		refreshOffset();
		child.forEach((a)->{
			a.draw(g);
		});
	}



	public void add(Drawable d) {
		if(d==null)return;
		child.add(d);
	}
	
	protected void refreshOffset() {
		int elements = 0; // count only the visible components
		int childTotalWidth = 0;
		for(Drawable d: child) {
			if(!d.visible)continue;
			childTotalWidth += d.w;
			elements ++;
		}
		
		// Prevents division by zero
		double childSpacing = (elements < 1) ? 0 : ((this.w - (padding *2) - childTotalWidth)) / (elements-1);
		//int childSpacing = 0;
		
		int elementPosition = padding +  this.x;
		for(Drawable d: child) {
			if(!d.visible)continue; // skip not visible components
			d.setXOffset(elementPosition);
			d.setYOffset(this.y);
			elementPosition += d.w;
			elementPosition += childSpacing;
		}
		
		
	}

}
