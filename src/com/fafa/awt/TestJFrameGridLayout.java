package com.fafa.awt;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJFrameGridLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2194056661788103531L;
	private JButton jb1, jb2, jb3, jb4, jb5;

	public static void main(String[] args) {
		new TestJFrameGridLayout();
	}

	public TestJFrameGridLayout() {
		this.setTitle("按钮测试");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2, 3, 30, 20));// 设置Frame
														// GridLayout流式布局2行3列
		// 创建两个按钮
		jb1 = new JButton("曹操");
		jb2 = new JButton("刘备");
		jb3 = new JButton("关羽");
		jb4 = new JButton("张飞");
		jb5 = new JButton("孙权");
		// 将按钮加到Frame中
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);

		this.setVisible(true);
	}
}
