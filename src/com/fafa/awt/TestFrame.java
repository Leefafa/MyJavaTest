package com.fafa.awt;

import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		//所有组件都是放在Frame中
		Frame f = new Frame();
		f.setTitle("Hello World");
		f.setSize(200,100);
		f.setLocation(100, 100);
		f.setVisible(true); 
		//关不掉窗口
	}
}
