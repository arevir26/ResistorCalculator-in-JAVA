package com.rivera.resistorcalc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import com.rivera.resistorcalc.UI.Band;
import com.rivera.resistorcalc.UI.Container;
import com.rivera.resistorcalc.UI.IDrawable;

public class CanvasPanel extends Canvas {


	protected Color c1, c2, c3, c4, c5 = Color.BLACK;
	
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
	
	public void setBandColors(Color c1, Color c2, Color c3, Color c4, Color c5) {
		b1.color = c1;
		b2.color = c2;
		b3.color = c3;
		b4.color = c4;
		b5.color = c5;
		b5.visible = true;
		updateBands();
		
	}
	
	public void setBandColors(Color c1, Color c2, Color c3, Color c4) {
		b1.color = c1;
		b2.color = c2;
		b3.color = c3;
		b4.color = c4;
		b5.visible = false;
		updateBands();
		
	}
	
	
	private void updateBands() {
		this.repaint();
		
	}
	

	private int getCenterY() {
		return (int)getSize().getHeight()/2;
	}
	
	private int getCenterX() {
		return (int)getSize().getWidth()/2;
	}
	
}
