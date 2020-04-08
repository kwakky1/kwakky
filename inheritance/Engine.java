package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneservice = new PhoneService();
		String message;
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(
					"0.종료 \t 1.전화번호입력 \t 2.전화기 내역 출력" + "\t 3.휴대전화입력 \t 4.휴대전화출력\t 5.IPHONE입력 \t 6.IPHONE출력")) {
			case "0":
				return;
			case "1":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 전화번호입력,이름,회사입력").split(",");
					phoneservice.add(new Phone(values[0], values[1], values[2]));

				}
				break;
			case "2":
				Phone[] phones = phoneservice.getPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("출력: %s, %s, %s \n", phones[i].getPhonNumber(), phones[i].getname(),
							phones[i].getCompany());

				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 전화번호,이름,회사,휴대").split(",");
					phoneservice.addCellPhone(new CellPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CellPhone[] cellPhones = phoneservice.getCellPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("출력: %s, %s, %s, %s \n", cellPhones[i].getPhonNumber(),
							cellPhones[i].getname(), cellPhones[i].getCompany(), cellPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 전화번호,이름,회사,휴대,검색").split(",");
					phoneservice.addSearch(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iPhones = phoneservice.getIphones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("출력: %s, %s, %s, %s  \n", iPhones[i].getPhonNumber(), iPhones[i].getname(),
							iPhones[i].getCompany(), iPhones[i].getMove(), iPhones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 전화번호,이름,회사,서치,빅사이즈").split(",");
					phoneservice.addGalaxyNote(new GalaxyNote(values[0], values[1], values[2], true, values[3],values[4]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = phoneservice.getGalaxyNotes();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("출력: %s, %s, %s, %s, %s, %s \n", galaxyNotes[i].getPhonNumber(), galaxyNotes[i].getname(),
							galaxyNotes[i].getCompany(), galaxyNotes[i].getMove(), galaxyNotes[i].getSearch(),galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}
