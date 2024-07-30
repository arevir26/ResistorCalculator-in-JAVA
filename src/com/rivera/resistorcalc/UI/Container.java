package com.rivera.resistorcalc.UI;

import java.awt.Graphics;
import java.util.ArrayList;

public class Container extends Drawable{
	
	
	protected ArrayList<Drawable> child = new ArrayList<>();
	
	public Container(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
	}
	
	
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		child.forEach((a)->{
			a.draw(g);
		});
	}



	public void add(Drawable d) {
		d.setXOffset(x);
		d.setYOffset(y);
		child.add(d);
	}

}
