package com.rivera.resistorcalc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CanvasPanel extends Canvas {
	
	protected Mode mode = Mode.FOUR;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(0,0, getSize().width, getSize().height);
		drawResistor(g);
		
	}

	public CanvasPanel() {
		super();
		setPreferredSize(new Dimension(500,100));
	}
	
	
	private void drawResistor(Graphics g) {
		
		int padding = 10;
		
		final int mainRectW = 300;
		final int mainRectH = 80;
		
		int mainRectX = getCenterX() - (mainRectW/2);
		int mainRectY = getCenterY() - (mainRectH/2);
		
		
		int bWidth = 25;
		int bHeight = 40;

		// draw background
		Color c = new Color(56, 255, 149, 255);
		
		drawFilledRectCentered(g, getCenterX(), getCenterY(), mainRectW, mainRectH, c);
		
		drawFilledRectCentered(g, getCenterX()-70, getCenterY(), bWidth, mainRectH, Color.red);
		drawFilledRectCentered(g, getCenterX()- 30, getCenterY(), bWidth, mainRectH, Color.red);
		drawFilledRectCentered(g, getCenterX()+30, getCenterY(), bWidth, mainRectH, Color.red);
		drawFilledRectCentered(g, getCenterX()+ 70, getCenterY(), bWidth, mainRectH, Color.red);		
		

		
		
		
		
	}
	
	private void drawFilledRectCentered(Graphics g, int x, int y, int w, int h, Color c) {
		int xf = x - (w/2);
		int yf = y - (h/2);
		g.setColor(c);
		g.fillRect(xf, yf, w, h);
	}
	
	private int getCenterY() {
		return (int)getSize().getHeight()/2;
	}
	
	private int getCenterX() {
		return (int)getSize().getWidth()/2;
	}
	
	
	public void setMode(Mode mode) {
		
	}
	
	enum Mode{
		FOUR, FIVE
	}
}
