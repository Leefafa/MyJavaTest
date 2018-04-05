package com.fafa.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestFrameEvent02 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new TestFrameEvent02();
	}
	
	public TestFrameEvent02(){
		this.setTitle("Hello");
		this.setLocation(100, 100);
		this.setSize(200, 100);
		this.addWindowListener(new MyWindowListner());
		this.setVisible(true);
	}
	
	//定义了一个事件监听器类,这个类没有被外部类访问的意义，所以直接使用内部类
	//如果直接实现windowslistener,会导致实现里面的所有方法，但很多方法都是没用的
	//此时JAVA就提供了一种适配器（Adapter）的方案来解决这种问题，每一个监听器的接口都存在一个适配器类，对所有方法都实现了一个空实现
	class MyWindowListner extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("closing");
			System.exit(0);
		}
	}
}
