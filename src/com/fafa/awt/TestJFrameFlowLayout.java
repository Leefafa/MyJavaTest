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
		this.setTitle("按钮测试");
		this.setSize(500,400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));	//设置Frame FlowLayout流式布局
		//创建两个按钮
		jb1 = new JButton("曹操");
		jb2 = new JButton("刘备");
		jb3 = new JButton("关羽");
		jb4 = new JButton("张飞");
		jb5 = new JButton("孙权");
		//将按钮加到Frame中
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		
		this.setVisible(true);
	}
}
