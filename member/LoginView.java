package com.jse.member;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
public class LoginView extends JFrame implements ActionListener {
	JButton savebutton;
	JButton cancelbutton;
	JTextField namefield, useridfield, passwordfield,ssnlabelfield;
	JLabel label,namelabel,useridlabel,passwordlabel,ssnlabel;
	JLabel[] labels;
	JPanel panel;
	JTextField[] jTextFields;
	private static final long serialVersionUID = 1L;
	
	public void open() {
	this.setSize(800,600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel lblJoin = new JLabel("로그인");
	lblJoin.setBounds(159, 41, 101, 20);
	this.add(lblJoin);
	panel = new JPanel();
	panel.setLayout(new FlowLayout());
	String[] names = {"아이디","패스워드"};
	labels = new JLabel[2];
	jTextFields = new JTextField[2];
	for (int i=0;i<names.length;i++) {
		labels[i] = new JLabel(names[i]);
		this.add(labels[i]);
		jTextFields[i] = new JTextField();
		this.add(jTextFields[i]);
	}
	label = new JLabel("로그인");
	savebutton = new JButton("로그인");
	cancelbutton = new JButton("취소");
	savebutton.addActionListener(this);
	cancelbutton.addActionListener(this);
	this.add(savebutton);
	this.add(cancelbutton);
	this.add(panel);
	labels[0].setBounds(69, 113, 69, 20);
	labels[1].setBounds(69, 163, 69, 20);
	jTextFields[0].setBounds(159, 156, 186, 35);
	jTextFields[1].setBounds(159, 106, 186, 35);
	savebutton.setBounds(159, 363, 90, 29);
	cancelbutton.setBounds(300, 363, 90, 29);
	this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == savebutton ) {
			jTextFields[0].setText("hong,kwak");
			jTextFields[1].setText("123,123");
			JOptionPane.showMessageDialog(this,String.format("%s / %s",
					jTextFields[0].getText(),jTextFields[1].getText()));
		}else if(e.getSource() == cancelbutton) {
			
		}
	}
}
