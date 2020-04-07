package com.jse.app;  // 보라색은 기능어, 검정색은 명사  클래스는 대문자 소문자는 폴더
import java.util.Scanner;
public class HelloJava { // public = 디폴드
	public static void main(String[] args) { // 클래스 안에 있으면 매소드
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("어디사세요?");
		String name = scanner.next();
		System.out.println("아 거기 " + name +" 참 좋은 곳이죠.");
		System.out.println("몇살이세요 ?");
		int age = scanner.nextInt(); // Integer
		System.out.println(age+"살이네요");
		System.out.println("키는 몇이고, 몸무게는 몇 kg입니까?");
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();  // String, int, float, double = type 
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.next().charAt(0);
		
		
	}

}
