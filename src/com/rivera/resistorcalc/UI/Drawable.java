package com.rivera.resistorcalc.UI;

import java.awt.Color;
import java.awt.Graphics;

public class Drawable implements IDrawable	{
	
	public int x = 0;
	public int y = 0;
	
	public int w = 0;
	public int h = 0;
	
	public Color color = Color.BLACK;
	
	protected int xOffset = 0;
	protected int yOffset = 0;
	
	public boolean visible = true;
	
	public Drawable() {
		
	}
	
	public Drawable(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void setXOffset(int x) {
		this.xOffset = x;
	}

	@Override
	public void setYOffset(int y) {
		this.yOffset = y;
	}

	@Override
	public void draw(Graphics g) {
		if(!visible)return;
		g.setColor(color);
		g.fillRect(x + xOffset, y + yOffset, w, h);
	}

}
