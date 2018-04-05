package com.fafa.awt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormEvent02 extends JFrame {

	private JPanel jp1,jp2,jp3;
	private JButton jb1,jb2;
	private JLabel jl1,jl2;
	private JTextField jtf;
	private JPasswordField jpf;
	
	public static void main(String[] args) {
		 new LoginFormEvent02();
	}

	public LoginFormEvent02() {
		this.setTitle("用户登录");
		this.setSize(400,150);
		this.setLocation(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new GridLayout(3, 1));
		
		jp1 = new JPanel();
		jl1 = new JLabel("用户名:");
		jtf = new JTextField(20);
		jp1.add(jl1);
		jp1.add(jtf);
		this.add(jp1);
		
		jp2 = new JPanel();
		jl2 = new JLabel("密   码:");
		jpf = new JPasswordField(20);
		jp2.add(jl2);
		jp2.add(jpf);
		this.add(jp2);
		
		jp3 = new JPanel();
		jb1 = new JButton("登录");
		jb2 = new JButton("取消");
		jp3.add(jb1);
		jp3.add(jb2);
		
		jb1.addActionListener(new MyBtnListener());
		jb2.addActionListener(new MyBtnListener());
		this.add(jp3);
		
		this.setVisible(true);
	}
	
	class MyBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//e.getSource可以获取哪个监听对象触发事件
			//System.out.println("OK"+e.getSource());
			if(e.getSource()==jb1){
				System.out.println("login");
				System.out.println("name:"+jtf.getText());
				System.out.println("passwd:"+new String(jpf.getPassword()));
			}else if(e.getSource()==jb2){
				System.out.println("Cancel");
				jtf.setText("");
				jpf.setText("");
			}
		}
	}
	
}
