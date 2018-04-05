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
		this.setTitle("按钮测试");
		this.setSize(500,400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 2));	//设置Frame BorderLayout的水平垂直layout
		//创建两个按钮
		jb1 = new JButton("北方");
		jb2 = new JButton("南方");
		jb3 = new JButton("西方");
		jb4 = new JButton("东方");
		jb5 = new JButton("中方");
		//将按钮加到Frame中
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
