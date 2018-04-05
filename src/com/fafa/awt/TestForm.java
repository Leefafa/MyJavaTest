package com.fafa.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class TestForm extends JFrame {
	public static void main(String[] args) {
		//所有的组件都是放在Frame中的
		Frame f = new Frame();
		Button btn = new Button("Hello");
		f.add(btn);
		f.setTitle("hello world");
		f.setSize(200,100);
		f.setLocation(100, 100);
		
		//为Frame添加窗口监听事件
		f.addWindowListener(new MyWindowListner());
		
		f.setVisible(true);
	}
	
}

//定义了一个事件监听器类
class MyWindowListner implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("closing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("close");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("act");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("act");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}