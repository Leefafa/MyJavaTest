package com.fafa.awt;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJButton extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2997678379033073281L;
	private JButton jb1, jb2;

	public static void main(String[] args) {
		new TestJButton();
	}

	public TestJButton() {
		this.setTitle("��ť����");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ����������ť
		jb1 = new JButton("JB1");
		jb2 = new JButton("JB2");
		// ����ť�ӵ�Frame��
		this.add(jb1);
		this.add(jb2);

		this.setVisible(true);
	}
}
