package com.rivera.resistorcalc;

import java.awt.Color;

public class Codes {
	
	private Codes() {}
	
	/**
	 * <h1>Color for Digits</h1>
	 */
	public enum DColors{
		BLACK,
		BROWN,
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		VIOLET,
		GREY,
		WHITE
	}
	
	/**
	 * <h1>Color for Multipliers</h1>
	 */
	public enum MColors{
		BLACK,
		BROWN,
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		VIOLET,
		GREY,
		WHITE,
		GOLD,
		SILVER
	}
	
	/**
	 * <h1>Color for Tolerance Value</h1>
	 */
	public enum TColors{
		BROWN,
		RED,
		GREEN,
		BLUE,
		VIOLET,
		GREY,
		GOLD,
		SILVER
	}
	
	/**
	 * Get the conversion value of Digit
	 * @param digit The DColors enum to convert
	 * @return the conversion value
	 */
	public static double getCodeValue(Codes.DColors digit) {
		switch(digit) {
		case BLACK:
			return 0;
		case BROWN:
			return 1;
		case RED:
			return 2;
		case ORANGE:
			return 3;
		case YELLOW:
			return 4;
		case GREEN:
			return 5;
		case BLUE:
			return 6;
		case VIOLET:
			return 7;
		case GREY:
			return 8;
		case WHITE:
			return 9;
		}
		return 0;
	}
	
	/**
	 * Get the conversion value of Digit
	 * @param mul The DColors enum to convert
	 * @return the conversion value
	 */
	public static double getCodeValue(Codes.MColors mul) {
		switch(mul) {
		case BLACK:
			return 1;
		case BROWN:
			return 10;
		case RED:
			return 100;
		case ORANGE:
			return 1000;
		case YELLOW:
			return 10000;
		case GREEN:
			return 100000;
		case BLUE:
			return 1000000;
		case VIOLET:
			return 10000000;
		case GREY:
			return 100000000;
		case WHITE:
			return 1000000000;
		case GOLD:
			return 0.1;
		case SILVER:
			return 0.01;
		}
		return 0;
	}
	
	public static double getCodeValue(Codes.TColors tol) {
		switch(tol) {
		case BROWN:
			return 1;
		case RED:
			return 2;
		case GREEN:
			return 0.5;
		case BLUE:
			return 0.25;
		case VIOLET:
			return 0.1;
		case GREY:
			return 0.05;
		case GOLD:
			return 5;
		case SILVER:
			return 20;
		}
		return 0;
	}
	
	public static Color getColor(Codes.DColors dcol) {
		switch(dcol) {
		case BLACK:
			return Color.BLACK;
		case BLUE:
			return Color.BLUE;
		case BROWN:
			return new Color(139,69,19);
		case RED:
			return Color.RED;
		case ORANGE:
			return Color.ORANGE;
		case YELLOW:
			return Color.YELLOW;
		case GREEN:
			return Color.GREEN;
		case VIOLET:
			return new Color(148,0,211);
		case GREY:
			return Color.GRAY;
		case WHITE:
			return Color.WHITE;
		default:
			return Color.black;
		}
	}
	
	public static Color getColor(Codes.MColors dcol) {
		switch(dcol) {
		case BLACK:
			return Color.BLACK;
		case BLUE:
			return Color.BLUE;
		case BROWN:
			return new Color(139,69,19);
		case RED:
			return Color.RED;
		case ORANGE:
			return Color.ORANGE;
		case YELLOW:
			return Color.YELLOW;
		case GREEN:
			return Color.GREEN;
		case VIOLET:
			return new Color(148,0,211);
		case GREY:
			return Color.GRAY;
		case WHITE:
			return Color.WHITE;
		case GOLD:
			return new Color(0,255,255,1);
		default:
			return Color.black;
		}
	}
	
	public static Color getColor(Codes.TColors tcol) {
		
		switch(tcol) {
		case BLUE:
			return Color.BLUE;
		case BROWN:
			return new Color(139, 69, 19);
		case GOLD:
			return new Color(0, 255,255,1);
		case GREEN:
			return Color.GREEN;
		case GREY:
			return Color.GRAY;
		case RED:
			return Color.RED;
		case SILVER:
			return Color.PINK;
		case VIOLET:
			return new Color(148,0,211);
		default:
			return Color.BLACK;
		}
	}

}
