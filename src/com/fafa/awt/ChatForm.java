package com.fafa.awt;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatForm extends JFrame {

	private JPanel jp1;
	private JTextArea jta;
	private JComboBox<String> jcb;
	private JTextField jtf;
	private JButton jb1;
	private JScrollPane jsp; 
	
	
	public static void main(String[] args) {
		new ChatForm();
	}

	public ChatForm() {
		this.setTitle("�û�����");
		this.setSize(600,500);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		jta = new JTextArea();
		//����������ʱֱ�ӽ���Ҫ�����Ķ���ͨ�����캯������
		jsp = new JScrollPane(jta);
		//ֱ����ӹ��������൱�������������
		this.add(jsp);
		jp1 = new JPanel();
		jcb = new JComboBox<String>(new String[]{"����","�ܲ�","С��"});
		jtf = new JTextField(20);
		jb1 = new JButton("����");
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb1);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
}
