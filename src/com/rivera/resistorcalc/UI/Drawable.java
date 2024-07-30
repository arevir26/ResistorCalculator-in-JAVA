package com.rivera.resistorcalc.UI;

import java.awt.Color;
import java.awt.Graphics;

public class Drawable implements IDrawable	{
	
	public int x = 0;
	public int y = 0;
	
	public int w = 10;
	public int h = 10;
	
	public Color color = Color.BLACK;
	
	protected int xOffset = 0;
	protected int yOffset = 0;

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
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
		g.setColor(color);
		g.fillRect(x + xOffset, y + yOffset, w, h);
	}

}
