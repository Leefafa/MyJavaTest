package com.fafa.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestFrameEvent01 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new TestFrameEvent01();
	}
	
	public TestFrameEvent01(){
		this.setTitle("Hello");
		this.setLocation(100, 100);
		this.setSize(200, 100);
		this.addWindowListener(new MyWindowListner());
		this.setVisible(true);
	}
	
	//������һ���¼���������,�����û�б��ⲿ����ʵ����壬����ֱ��ʹ���ڲ���
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
}
