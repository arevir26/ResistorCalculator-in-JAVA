package com.rivera.resistorcalc;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		MainPanel panel = new MainPanel();
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Resistor Calculator");
				window.add(panel);
				window.pack();
				window.setVisible(true);
			}
				
		});
	}

}
