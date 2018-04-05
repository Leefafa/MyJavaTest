package com.fafa.awt;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJFrameBorderLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2194056661788103531L;
	private JButton jb1,jb2,jb3,jb4,jb5; 
	public static void main(String[] args) {
		new TestJFrameBorderLayout();
	}
	public TestJFrameBorderLayout(){
		this.setTitle("��ť����");
		this.setSize(500,400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 2));	//����Frame BorderLayout��ˮƽ��ֱlayout
		//����������ť
		jb1 = new JButton("����");
		jb2 = new JButton("�Ϸ�");
		jb3 = new JButton("����");
		jb4 = new JButton("����");
		jb5 = new JButton("�з�");
		//����ť�ӵ�Frame��
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
