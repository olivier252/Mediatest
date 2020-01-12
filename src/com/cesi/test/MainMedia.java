package com.cesi.test;

import javax.swing.SwingUtilities;

import com.cesi.test.MainWindows;

public class MainMedia {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				MainWindows m = new MainWindows();
				m.setVisible(true);
			}
		});
	}
}


