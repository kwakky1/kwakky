package com.jse.member;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
public class MemberView extends JFrame implements ActionListener {
	JButton savebutton,loginbutton,listbutton,detailbutton,namebutton,genderbutton,countbutton,updatebutton,deletebutton;
	JTextField namefield, useridfield, passwordfield,ssnlabelfield;
	JLabel label,namelabel,useridlabel,passwordlabel,ssnlabel;
	JLabel[] labels;
	JPanel panel;
	JTextField[] jTextFields;
	JTextArea jTextArea;
	MemberService memberService;
		public MemberView() {
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
		String[] names = {"이름","아이디","패스워드","주민등록번호","주소","검색결과"};
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
		detailbutton = new JButton("detail");
		namebutton = new JButton("name");
		genderbutton = new JButton("gender");
		countbutton = new JButton("count");
		updatebutton = new JButton("update");
		deletebutton = new JButton("delete");
		
		savebutton.addActionListener(this);
		listbutton.addActionListener(this);
		loginbutton.addActionListener(this);
		detailbutton.addActionListener(this);
		namebutton.addActionListener(this);
		genderbutton.addActionListener(this);
		countbutton.addActionListener(this);
		updatebutton.addActionListener(this);
		deletebutton.addActionListener(this);
		this.add(savebutton);
		this.add(listbutton);
		this.add(loginbutton);
		this.add(detailbutton);
		this.add(namebutton);
		this.add(genderbutton);
		this.add(countbutton);
		this.add(updatebutton);
		this.add(deletebutton);
		this.add(panel);
		
		labels[0].setBounds(69, 113, 69, 20);
		labels[1].setBounds(69, 163, 69, 20);
		labels[2].setBounds(69, 210, 69, 20);
		labels[3].setBounds(69, 250, 80, 40);
		labels[4].setBounds(69, 300, 80, 40);
		labels[5].setBounds(350, 113, 80, 20);
		jTextFields[0].setBounds(159, 106, 186, 35);
		jTextFields[1].setBounds(159, 156, 186, 35);
		jTextFields[2].setBounds(159, 203, 186, 35);
		jTextFields[3].setBounds(159, 253, 186, 35);
		jTextFields[4].setBounds(159, 300, 186, 35);
		jTextArea.setBounds(450, 113, 250, 350);
		savebutton.setBounds(159, 363, 90, 29);
		loginbutton.setBounds(250, 363, 90, 29);
		listbutton.setBounds(350, 363, 90, 29);
		detailbutton.setBounds(159, 400, 90, 29);
		namebutton.setBounds(250, 400, 90, 29);
		genderbutton.setBounds(350, 400, 90, 29);
		countbutton.setBounds(159, 450, 90, 29);
		updatebutton.setBounds(250, 450, 90, 29);
		deletebutton.setBounds(350, 450, 90, 29);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == savebutton ) {
			jTextFields[0].setText("홍길동,홍길동,이순신,신사임당,이도");
			jTextFields[1].setText("hong,you,lee,shin,do");
			jTextFields[2].setText("1,1,1,1,1");
			jTextFields[3].setText("900101-1,910120-5,980120-1,930120-4,000103-3");
			jTextFields[4].setText("서울,서울,서울,부산,부산");
			
//			JOptionPane.showMessageDialog(this,String.format("%s / %s / %s / %s / %s", 
//					jTextFields[0].getText(),
//					jTextFields[1].getText(),
//					jTextFields[2].getText(),
//					jTextFields[3].getText(),
//					jTextFields[4].getText()));
			
			String data = String.format("%s/%s/%s/%s/%s", 
					jTextFields[0].getText(),
					jTextFields[1].getText(),
					jTextFields[2].getText(),
					jTextFields[3].getText(),
					jTextFields[4].getText()); 
			
			String[] arr = data.split("/");
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwords = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			
			for(int i=0;i<names.length;i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwords[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
			}
			
		}else if(e.getSource() == listbutton) {
			Member[] members = memberService.list();
			String add = "";
			for(int i=0;i<memberService.count();i++) {
				add += members[i]+"\n";
				jTextFields[i].setText("");
			}
			jTextArea.setText(add);
		
		}else if(e.getSource() == loginbutton) {
			Member member= new Member();
			member.setUserid(jTextFields[1].getText());
			member.setPasswd(jTextFields[2].getText());
			Member returnMember = memberService.login(member); 
			if(returnMember !=null) { // 처음에는 패스워드로 비교했음
				jTextArea.setText(returnMember.toString());
			} else { 
				jTextArea.setText("로그인실패");			
				}
			
		} else if(e.getSource() == detailbutton) {
				Member detail = memberService.detail(jTextFields[1].getText());
				if(detail !=null) {
					jTextArea.setText(detail.toString());
				} else {
					jTextArea.setText("아이디 없음");
				}
			
			} else if(e.getSource() == namebutton) {
				Member[] name = memberService.searchByName(jTextFields[0].getText());
				String names ="";
				if(name !=null) {
					for(int i=0;i<name.length;i++) {
						names += name[i]+"\n";
					}
					jTextArea.setText(names.toString());
					} else {
						jTextArea.setText("없음");
					}
			
			} else if(e.getSource() == genderbutton) { 
				Member[] gender = memberService.searchByGender(jTextFields[3].getText());
				String genders ="";
				if(gender !=null) {
					for(int i=0;i<gender.length;i++) {
						genders += gender[i]+"\n";
					}
					jTextArea.setText(genders.toString());
					}
			
			} else if(e.getSource() == countbutton) {
				jTextArea.setText(String.valueOf(memberService.count()));
			
			} else if(e.getSource() == updatebutton) {
				String userid = jTextFields[1].getText();
				String newPassword = jTextFields[2].getText();
				Member update = new Member();
				update.setUserid(userid);
				update.setPasswd(newPassword);
				memberService.update(update);
			
			}else if(e.getSource() == deletebutton) {
				String userid = jTextFields[1].getText();
				String password = jTextFields[2].getText();
				Member delete = new Member();
				delete.setUserid(userid);
				delete.setPasswd(password);
				memberService.delete(delete);
				
			}
		}
	}
