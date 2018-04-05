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
		this.setTitle("用户聊天");
		this.setSize(600,500);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		jta = new JTextArea();
		//创建滚动条时直接将需要滚动的对象通过构造函数传入
		jsp = new JScrollPane(jta);
		//直接添加滚动条就相当于添加了这个组件
		this.add(jsp);
		jp1 = new JPanel();
		jcb = new JComboBox<String>(new String[]{"刘备","曹操","小明"});
		jtf = new JTextField(20);
		jb1 = new JButton("发送");
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb1);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
}
