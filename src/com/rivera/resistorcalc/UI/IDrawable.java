package com.rivera.resistorcalc.UI;

import java.awt.Graphics;

public interface IDrawable {
	void setX(int x);
	void setY(int y);
	void setXOffset(int x);
	void setYOffset(int y);
	void draw(Graphics g);
}
