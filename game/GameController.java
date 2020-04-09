package com.jse.game;
import java.util.Scanner;

import com.jse.member.Member;
import com.jse.util.Calculator;

import java.util.Random;
public class GameController {
	public static void main(String[] args) {
		// public static String test; declaring  멤버변수
		Scanner scanner = new Scanner(System.in); // scanner = 인스턴스를 만들었다.
		Member member = new Member();
		Random random = new Random();
		Dice dice = null;
		RPSGame rpsgame = null;
		Calculator calculator = null;
		Kaup kaup = null;
		while(true) {
			System.out.println("0.종료  "
					+" 1.회원가입 "
					+" 2.로그인 "
					+" 3.계산기 "
					+" 4.주사위 홀짝 맞추기 "
					+" 5.가위바위보 "
					+" 6.kaup "
					+" 7.1부터 100까지의 합 ");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("회원가입"); 
				System.out.println("아이디입력");
				String id = scanner.next();
				member.setId(id);
				
			break;
			case 2: 
				System.out.println("로그인");
				System.out.println("아이디입력");
				String id2 = scanner.next();
				String returnid = member.getId();
				System.out.println("로그인된 아이디 : " + returnid);
				if(id2.equals(returnid)) {
					System.out.println("로그인 성공");	
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				calculator = new Calculator();
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				System.out.println("두번째 수 입력");// 두번째 수 입력
				int b = scanner.nextInt();
				calculator.setNum2(b);
				int c = calculator.calculate();
				System.out.println("두수의 합은"+c);
				break;
			case 4:
				dice = new Dice();
				System.out.println("*** 주사위 홀짝 맞추기 게임 ***");
				System.out.println("기대하는 값 홀/짝을 입력해 주세요");
				String expect = scanner.next();
				System.out.println(String.format("사용자가 입력한 값: %s",expect));
				dice.setFirst(expect);
				int hi = random.nextInt(6)+1;
				String result ="";
				switch(hi) {
				case 1:case 3:case 5: result = "홀"; break;
				case 2:case 4:case 6: result = "짝"; break;
				}
				
				System.out.println(String.format("컴퓨터 입력 값: %s",result));
				dice.setSecond(result);
				System.out.println(dice.dice());
				break;
			case 5:
				rpsgame = new RPSGame();
				System.out.println("가위1 바위2 보3 을 입력하세요!");
				int t = scanner.nextInt();
				rpsgame.setUValue(t);
				
				int y = random.nextInt(3)+1;
				rpsgame.setCValue(y);
				System.out.println(rpsgame.game1());
				System.out.println(rpsgame.game2());
				System.out.println(rpsgame.game());
				break;
			case 6:
				kaup = new Kaup();
				System.out.println("kaup 지수를 확인하겠습니다.");
				System.out.println("몸무게를 입력해주세요.");
				kaup.setWeight(scanner.nextDouble());
				System.out.println("키를 입력해주세요.");
				kaup.setTall(scanner.nextDouble()/100);
				System.out.println(kaup.result());
				break;
				
			}
		}
	}
	
}
