package com.fafa.awt;

import java.awt.Frame;

public class MyFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MyFrame();
	}
	
	public MyFrame(){
		this.setTitle("Hello");
		this.setLocation(100, 100);
		this.setSize(200, 100);
		this.setVisible(true);
	}
}
