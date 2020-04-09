package com.jse.arr;
import java.util.Scanner;
import com.jse.util.Constants;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.smartcardio.Card;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		KService service1 = new KService();
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU2)) {
			case "0": return;
			case "1": JOptionPane.showInputDialog(Constants.CARD_MENU);
			
			for(int i=0; i<3;i++) {
				String[] values = JOptionPane.showInputDialog(Constants.CARD_MENU).split(",");
				service.add(new CardBean(values[0], values[1]));
			}
			break;
			case "2":
				CardBean[] cards = service.getCards();
				for(int i=0;i<3;i++) {
					System.out.println(String.format("카드모양 %s \t 카드번호 %d",
							cards[i].getKind(),cards[i].getNumber()));
					
				}
			break;
			case "3": System.out.println("카드3장받기 모양, 숫자");
			for(int i=0; i<3;i++) {
				service1.add1(new KBean(scanner.next(),
						scanner.nextInt()));
			}
			break;
			case "4":
				KBean[] card1 = service1.getCards(); 
				for(int i=0;i<3;i++) {
					System.out.println(String.format("카드모양 %s\t카드번호%d",
							card1[i].getShape(),card1[i].getNumber()));	
				}
				
			break;
			}
		}
}
}
