package com.fafa.awt;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuForm extends JFrame {
	private static final long serialVersionUID = -8179407073295349672L;
	
	private JMenuBar jmb;
	private JMenu jm1,jm2,jm3;
	private JMenuItem jmi1,jmi2,jmi3,jmi4;
	
	public static void main(String[] args) {
		new MenuForm();
	}
	
	public MenuForm() {
		this.setTitle("²Ëµ¥Á·Ï°");
		this.setSize(600,500);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		jmb = new JMenuBar();
		jm1 = new JMenu("File");
		jm2 = new JMenu("Help");
		jm3 = new JMenu("Save");
		jmi1 = new JMenuItem("Open");
		jmi2 = new JMenuItem("New");
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jm3);
		jmi3 = new JMenuItem("Save...");
		jmi4 = new JMenuItem("Save as...");
		jm3.add(jmi3);
		jm3.add(jmi4);
		
		jmb.add(jm1);
		jmb.add(jm2);
		
		
		this.add(jmb,BorderLayout.NORTH);
		this.setVisible(true);
	}
}
