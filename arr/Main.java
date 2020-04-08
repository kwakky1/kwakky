package com.jse.arr;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		KService service1 = new KService();
		while(true) {
			System.out.println("0.나가기 1.Card3장 받기 2.출력");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: System.out.println("Card 3장 받기 모양, 숫자");
			for(int i=0; i<3;i++) {
				service.add(new CardBean(scanner.next()
						,scanner.nextInt()));
				System.out.println((i+1)+"번째 입력 끝");
			}
			break;
			case 2:
				CardBean[] cards = service.getCards();
				for(int i=0;i<3;i++) {
					System.out.println(String.format("카드모양 %s \t 카드번호 %d",
							cards[i].getKind(),cards[i].getNumber()));
					
				}
			break;
			case 3: System.out.println("카드3장받기 모양, 숫자");
			for(int i=0; i<3;i++) {
				service1.add1(new KBean(scanner.next(),
						scanner.nextInt()));
			}
				
					
			break;
			case 4:
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
