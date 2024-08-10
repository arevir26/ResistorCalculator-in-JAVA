package com.rivera.resistorcalc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import com.rivera.resistorcalc.UI.Band;
import com.rivera.resistorcalc.UI.Container;
import com.rivera.resistorcalc.UI.Drawable;
import com.rivera.resistorcalc.UI.IDrawable;

public class CanvasPanel extends Canvas {
	
	protected Mode mode = Mode.FOUR;
	
	protected Codes.DColors digit1 = Codes.DColors.values()[0];
	protected Codes.DColors digit2 = Codes.DColors.values()[0];
	protected Codes.DColors digit3 = Codes.DColors.values()[0];
	protected Codes.MColors multiplier = Codes.MColors.values()[0];
	protected Codes.TColors tolerance = Codes.TColors.GOLD;
	
	protected IDrawable resistorLead;
	protected IDrawable resistorBody;
	protected Band b1, b2, b3, b4, b5;
	protected final int bWidth = 30;
	protected final int bHeight = 80;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		resistorLead.draw(g);
		resistorBody.draw(g);
		
		
	}

	public CanvasPanel() {
		super();
		setPreferredSize(new Dimension(500,100));
		
		resistorLead = new Container(50, 40, 400, 20);
		
		Container rbody = new Container(100,10,300, 80);
		rbody.color = Color.CYAN;
		resistorBody = rbody;
		
		b1 = new Band(bWidth,bHeight);
		b1.color = Color.red;
		b1.visible = false;
		rbody.add(b1);
		
		b2 = new Band(bWidth,bHeight);
		rbody.add(b2);
		
		b3 = new Band(bWidth,bHeight);
		rbody.add(b3);
		
		b4 = new Band(bWidth, bHeight);
		rbody.add(b4);
		
		b5 = new Band( bWidth, bHeight);
		rbody.add(b5);
		
		
		
		
	}
	
	
	private void drawBands() {
		
		
	}
	

	private int getCenterY() {
		return (int)getSize().getHeight()/2;
	}
	
	private int getCenterX() {
		return (int)getSize().getWidth()/2;
	}
	
	
	public void setMode(Mode mode) {
		
	}
}
