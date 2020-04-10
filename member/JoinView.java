package com.jse.member;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
public class JoinView extends JFrame implements ActionListener {
	JButton savebutton;
	JButton cancelbutton;
	JTextField namefield, useridfield, passwordfield,ssnlabelfield;
	JLabel label,namelabel,useridlabel,passwordlabel,ssnlabel;
	JLabel[] labels;
	JPanel panel;
	private static final long serialVersionUID = 1L;
	
	public void open() {
	this.setSize(800,600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel lblJoin = new JLabel("회원가입");
	lblJoin.setBounds(159, 41, 101, 20);
	this.add(lblJoin);
	panel = new JPanel();
	panel.setLayout(new FlowLayout());
	labels = new JLabel[5];
	for (int i=0;i<5;i++) {
		labels[i] = new JLabel("이름");
	}
	label = new JLabel("회원가입");
	namelabel = new JLabel("이름");
	useridlabel = new JLabel("아이디");
	passwordlabel = new JLabel("패스워드");
	ssnlabel = new JLabel("주민등록번호");
	savebutton = new JButton("저장");
	cancelbutton = new JButton("취소");
	savebutton.addActionListener(this);
	cancelbutton.addActionListener(this);
	namefield = new JTextField();
	useridfield = new JTextField();
	passwordfield = new JTextField();
	ssnlabelfield = new JTextField();
	this.add(savebutton);
	this.add(cancelbutton);
	this.add(label);
	this.add(namelabel);
	this.add(useridlabel);
	this.add(passwordlabel);
	this.add(ssnlabel);
	this.add(namefield);
	this.add(useridfield);
	this.add(passwordfield);
	this.add(ssnlabelfield);
	this.add(panel);
	namelabel.setBounds(69, 113, 69, 20);
	useridlabel.setBounds(69, 163, 69, 20);
	passwordlabel.setBounds(69, 210, 69, 20);
	ssnlabel.setBounds(69, 250, 80, 40);
	namefield.setBounds(159, 156, 186, 35);
	useridfield.setBounds(159, 106, 186, 35);
	passwordfield.setBounds(159, 203, 186, 35);
	ssnlabelfield.setBounds(159, 253, 186, 35);
	savebutton.setBounds(159, 363, 70, 29);
	cancelbutton.setBounds(300, 363, 70, 29);
	this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == savebutton ) {
			JOptionPane.showMessageDialog(this,namefield.getText());
		}else if(e.getSource() == cancelbutton) {
			
		}
	}
}
