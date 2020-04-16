package com.jse.grade;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.jse.member.MemberService;
import com.jse.member.MemberServiceImpl;
public class GradeView extends JFrame implements ActionListener {
	JButton savebutton,listbutton, loginbutton;
	JTextField namefield, useridfield, passwordfield,ssnlabelfield;
	JLabel label,namelabel,useridlabel,passwordlabel,ssnlabel;
	JLabel[] labels;
	JPanel panel;
	JTextField[] jTextFields;
	JTextArea jTextArea;
	GradeService gradeService; 
	public GradeView() {
		gradeService = new GradeServiceImpl();
	}
	private static final long serialVersionUID = 1L;
	
	public void open() {
			
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		String[] names = {"이름","국어","영어","수학","자바"};
		labels = new JLabel[6];
		jTextFields = new JTextField[6];
		jTextArea = new JTextArea();
		for (int i=0;i<names.length;i++) {
			labels[i] = new JLabel(names[i]);
			this.add(labels[i]);
			jTextFields[i] = new JTextField();
			this.add(jTextFields[i]);
		}
		this.add(jTextArea);
		label = new JLabel("회원가입");
		savebutton = new JButton("저장");
		listbutton = new JButton("목록");
		loginbutton = new JButton("로그인");
		
		savebutton.addActionListener(this);
		listbutton.addActionListener(this);
		loginbutton.addActionListener(this);
		
		this.add(savebutton);
		this.add(listbutton);
		this.add(loginbutton);
		this.add(panel);
		
		labels[0].setBounds(69, 113, 69, 20);
		labels[1].setBounds(69, 163, 69, 20);
		labels[2].setBounds(69, 210, 69, 20);
		labels[3].setBounds(69, 250, 80, 40);
		labels[4].setBounds(69, 300, 80, 40);
		
		jTextFields[0].setBounds(159, 156, 186, 35);
		jTextFields[1].setBounds(159, 106, 186, 35);
		jTextFields[2].setBounds(159, 203, 186, 35);
		jTextFields[3].setBounds(159, 253, 186, 35);
		jTextFields[4].setBounds(159, 300, 186, 35);
		
		jTextArea.setBounds(450, 113, 250, 350);
		savebutton.setBounds(159, 363, 70, 29);
		listbutton.setBounds(350, 363, 70, 29);
		loginbutton.setBounds(250, 363, 90, 29);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==savebutton) {
			jTextFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			jTextFields[1].setText("100,100,90,80,90");
			jTextFields[2].setText("100,100,90,80,90");
			jTextFields[3].setText("100,100,90,80,90");
			jTextFields[4].setText("100,100,90,80,90");

		String[] names = jTextFields[0].getText().split(",");
		String[] koreans = jTextFields[1].getText().split(",");
		String[] englishes = jTextFields[2].getText().split(",");
		String[] maths = jTextFields[3].getText().split(",");
		String[] javas = jTextFields[4].getText().split(",");
		
		Grade[] grades = new Grade[5];
		for(int i=0;i<names.length;i++) {
			grades[i] = new Grade();
			grades[i].setName(names[i]);
			grades[i].setKorean(Integer.parseInt(koreans[i]));
			grades[i].setEnglish(Integer.parseInt(englishes[i]));
			grades[i].setMath(Integer.parseInt(maths[i]));
			grades[i].setJava(Integer.parseInt(javas[i]));
			gradeService.add(grades[i]);
		} 
			
		}else if(e.getSource() == listbutton) {
			Grade[] grades = gradeService.list();
			String add = "";
			for(int i=0;i<grades.length;i++) {
				add += grades[i]+"\n";
				jTextFields[i].setText("");
			}
			
			jTextArea.setText(add);
		} else if(e.getSource() == loginbutton) {
			
		}
	}
}
