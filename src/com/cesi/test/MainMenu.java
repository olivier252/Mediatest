package com.cesi.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JFrame {
	
	public void create(JPanel panel, JTextField jt) {
		jt = new JTextField();
		jt.setColumns(10);
		panel.add(jt);
	}
	

	
	
	public void createMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		  JMenu test1 = new JMenu("Fichier");
		  JMenu test1_2 = new JMenu("Sous ficher");
		  JMenu test2 = new JMenu("Edition");

		  JMenuItem item1 = new JMenuItem("Ouvrir");
		  JMenuItem item2 = new JMenuItem("Fermer");
		  JMenuItem item3 = new JMenuItem("Lancer");
		  JMenuItem item4 = new JMenuItem("Arrêter");
		  
		  test1.add(item1);

	 

	    //Ajout du sous-menu dans notre menu
	    test1.add(test1_2);
	    //Ajout d'un séparateur
	    //test1.addSeparator();
	    item2.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent arg0) {
	        System.exit(0);
	      }        
	    });
	    test1.add(item2);  
	    test2.add(item3);
	    test2.add(item4);

	    //L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à droite
	    //Le premier ajouté sera tout à gauche de la barre de menu et inversement pour le dernier
	    menuBar.add(test1);
	    menuBar.add(test2);
	    setJMenuBar(menuBar);
	    setVisible(true);
	}
}