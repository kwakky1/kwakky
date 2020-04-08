package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneservice = new PhoneService();
		while(true) {
			System.out.println();
		 	switch(JOptionPane.showInputDialog("0.종료 \t1.전화번호입력 \t2.전화기 내역 출력")) {
		 	case "0":	return;
		 	case "1": 
		 		
		 		for(int i=0;i<3;i++) {
		 			String[] values = JOptionPane.showInputDialog("입력 전화번호입력,이름,회사입력").split(",");
		 		 		phoneservice.add(new Phone(values[0],values[1],values[2]));
		 		 		
		 		}
		 	break;
		 	case "2": 
		 		Phone[] phones =phoneservice.getPhones();
		 		String message ="";	
		 		for(int i=0;i<3;i++) {
		 			message +=String.format("출력: %s, %s, %s \n", phones[i].getPhonNumber(),
		 					phones[i].getname(),phones[i].getCompany());
	 			
		 	}
		 		JOptionPane.showMessageDialog(null, message);
		 		
	 		break;
			}
		}
	}
}
