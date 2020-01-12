package com.cesi.test;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionMedia extends AbstractAction {
	
	public ActionMedia(MainWindows mw, String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("salut Roger");
		System.exit(0);
	}        
}
