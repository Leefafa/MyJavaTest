package com.fafa.awt;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TestPanel extends JFrame {

	private JPanel jp1,jp2;
	private JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		new TestPanel();
	}

	public TestPanel() {
		this.setTitle("��ť����");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel��Ĭ�ϲ�����FlowLayout
		jp1=new JPanel();
		jp2=new JPanel();
		
		// ����������ť
		jb1 = new JButton("�ܲ�");
		jb2 = new JButton("����");
		jb3 = new JButton("����");
		jb4 = new JButton("�ŷ�");
		jb5 = new JButton("��Ȩ");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3 );
		jp2.add(jb4);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb5);

		this.setVisible(true);
	}
}
