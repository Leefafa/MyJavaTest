package com.fafa.awt;

import java.awt.Color;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MyJFrame();
	}
	
	public MyJFrame(){
		this.setTitle("Hello");
		this.setSize(500,400);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
