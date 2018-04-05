package com.fafa.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestFrameEvent03 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new TestFrameEvent03();
	}
	
	public TestFrameEvent03(){
		this.setTitle("Hello");
		this.setLocation(100, 100);
		this.setSize(200, 100);
		//���˹ر�֮�⣬�����Ķ��ò�������������Ϊ�����ڲ���
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("closing");
				System.exit(0);
			}
		});
		this.setVisible(true);
	}
	
	//������һ���¼���������,�����û�б��ⲿ����ʵ����壬����ֱ��ʹ���ڲ���
	//���ֱ��ʵ��windowslistener,�ᵼ��ʵ����������з��������ܶ෽������û�õ�
	//��ʱJAVA���ṩ��һ����������Adapter���ķ���������������⣬ÿһ���������Ľӿڶ�����һ���������࣬�����з�����ʵ����һ����ʵ��
//	class MyWindowListner extends WindowAdapter{
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.out.println("closing");
//			System.exit(0);
//		}
//	}
}
