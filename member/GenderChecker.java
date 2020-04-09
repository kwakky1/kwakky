package com.jse.member;
import java.util.Scanner;
public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println("주민번호를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();
		System.out.println(ssn);
		char ch = ssn.charAt(7);
		String result ="";
		switch(ch) {
		case '1':case'3': result ="남성입니다."; break;
		case '2':case'4': result ="여성입니다."; break;
		case '5':case'6': result ="외국인입니다."; break;
		default : result ="해당사항이 없습니다."; break;
		}
		System.out.println(result); 	
	}
}
