package com.cesi.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainWindows extends JFrame{
	JPanel panel;

	public MainWindows(){
		build();
	}

	private void build(){
		setTitle("Ma premi�re fen�tre");
		setSize(600, 800); 
		setLocationRelativeTo(null); 
		setResizable(true); //
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(buildContentPane());
	}


	public JPanel buildContentPane(){
		panel = new JPanel();
		//Cr�ation barre de menu
		JMenuBar menuBar = new JMenuBar();
		
		//Items dans la barre de menu
		JMenu menuHome = new JMenu("Accueil");
		JMenu menuGestion = new JMenu("Gestion");
		
		//Ajout items menu � la menuBar
		menuBar.add(menuHome);
		menuBar.add(menuGestion);

		//INstances des items de premier niveau et d�claration d'un actionPerformed() qui ferme l'appli
		JMenuItem itemHome = new JMenuItem("Retour � l'accueil");
		JMenuItem itemClose = new JMenuItem(new ActionMedia(this, "Fermer"));
		
		JMenuItem itemInsertBook = new JMenuItem("Ins�rer un livre");
		JMenuItem itemInsertCd = new JMenuItem("Ins�rer un CD");

		//Ajout items de premier niveau au premier item du menu (Accueil)
		menuHome.add(itemHome);
		menuHome.add(itemClose);
		
		//Ajout des items de preier niveau au deuxi�me item du menu (Gestion)
		menuGestion.add(itemInsertBook);
		menuGestion.add(itemInsertCd);
		
		setJMenuBar(menuBar);
		setVisible(true);

		
//		itemClose.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//			}        
//		});

		return panel;
	}
}