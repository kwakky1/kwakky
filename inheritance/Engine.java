package com.jse.inheritance;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneservice = new PhoneService();
		while(true) {
			System.out.println("0.종료 \t1.전화번호입력 \t2.전화기 내역 출력");
		 	switch(scanner.nextInt()) {
		 	case 0:	return;
		 	case 1: 
		 		for(int i=0;i<3;i++) {
		 		System.out.println("전화번호입력,이름,회사입력");
		 		 		phoneservice.add(new Phone(scanner.next(),
		 		 				scanner.next(),scanner.next()));
		 		 		System.out.println((i+1)+"번째 입력 끝");
		 		}
		 	break;
		 	case 2: System.out.println("전화기 내역 출력");
		 		for(int i=0;i<3;i++) {
		 			Phone[] phones =phoneservice.getPhones();
		 			System.out.println(String.format("%s %s %s", phones[i].getPhonNumber(),
		 					phones[i].getname(),phones[i].getCompany()));
	 			
		 		}
	 		break;
			}
		}
	}
}
