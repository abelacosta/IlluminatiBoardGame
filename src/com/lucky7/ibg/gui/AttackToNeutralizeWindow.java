package com.lucky7.ibg.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.lucky7.ibg.Game;

public class AttackToNeutralizeWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	JPanel panel;
	Game game;
	JLabel attackLabel;
	JLabel rollLabel;
	
	public AttackToNeutralizeWindow(Game g) {
		panel = new JPanel();
		game = g;
	}

}