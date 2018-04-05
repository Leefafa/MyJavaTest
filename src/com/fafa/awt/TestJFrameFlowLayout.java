package com.fafa.awt;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJFrameFlowLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2194056661788103531L;
	private JButton jb1,jb2,jb3,jb4,jb5; 
	public static void main(String[] args) {
		new TestJFrameFlowLayout();
	}
	public TestJFrameFlowLayout(){
		this.setTitle("��ť����");
		this.setSize(500,400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));	//����Frame FlowLayout��ʽ����
		//����������ť
		jb1 = new JButton("�ܲ�");
		jb2 = new JButton("����");
		jb3 = new JButton("����");
		jb4 = new JButton("�ŷ�");
		jb5 = new JButton("��Ȩ");
		//����ť�ӵ�Frame��
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		
		this.setVisible(true);
	}
}
