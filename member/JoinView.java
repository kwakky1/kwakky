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
	JTextField[] jTextFields;
	MemberService memberService;
		public JoinView() {
			memberService =new MemberServiceImpl();
		}
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
	String[] names = {"이름","아이디","패스워드","주민등록번호"};
	labels = new JLabel[5];
	jTextFields = new JTextField[5];
	for (int i=0;i<names.length;i++) {
		labels[i] = new JLabel(names[i]);
		this.add(labels[i]);
		jTextFields[i] = new JTextField();
		this.add(jTextFields[i]);
	}
	label = new JLabel("회원가입");
	savebutton = new JButton("저장");
	cancelbutton = new JButton("취소");
	savebutton.addActionListener(this);
	cancelbutton.addActionListener(this);
	this.add(savebutton);
	this.add(cancelbutton);
	this.add(panel);
	labels[0].setBounds(69, 113, 69, 20);
	labels[1].setBounds(69, 163, 69, 20);
	labels[2].setBounds(69, 210, 69, 20);
	labels[3].setBounds(69, 250, 80, 40);
	jTextFields[0].setBounds(159, 156, 186, 35);
	jTextFields[1].setBounds(159, 106, 186, 35);
	jTextFields[2].setBounds(159, 203, 186, 35);
	jTextFields[3].setBounds(159, 253, 186, 35);
	savebutton.setBounds(159, 363, 70, 29);
	cancelbutton.setBounds(300, 363, 70, 29);
	this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == savebutton ) {
			jTextFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			jTextFields[1].setText("hong,you,lee,shin,do");
			jTextFields[2].setText("1,1,1,1,1");
			jTextFields[3].setText("900101-1,910120-2,980120-1,930120-1,000103-3");
			JOptionPane.showMessageDialog(this,String.format("%s / %s / %s / %s ", 
					jTextFields[0].getText(),
					jTextFields[1].getText(),
					jTextFields[2].getText(),
					jTextFields[3].getText()));
			String[] data = String.format("%s / %s / %s / %s", 
					jTextFields[0].getText(),
					jTextFields[1].getText(),
					jTextFields[2].getText(),
					jTextFields[3].getText()).split("/"); 
		
			String[] names = data[0].split(",");
			String[] ids = data[1].split(",");
			String[] pws = data[2].split(",");
			String[] ssns = data[3].split(",");
			memberService.add(new Member(names[0],ids[0],pws[0],ssns[0]));
			
			// 각 스플릿을 통해 담는다.
			
			
			Member[] members = memberService.getMemebers();
			for(int i=0;i < members.length; i++) {
				System.out.println(members[i].toString());
			}
		}else if(e.getSource() == cancelbutton) {
			
		}
	}
}
