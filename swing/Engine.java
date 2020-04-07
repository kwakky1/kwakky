package com.jse.swing;

import java.util.Scanner;

public class Engine {
// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		MemberBean[] members = new MemberBean[3];
		while (true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력  3.비교하기  4.회원가입");
			switch (scanner.nextInt()) {
			case 0:System.out.println("종료");return;
			case 1:System.out.println("성적표");
				for(int i=0;i<3;i++) {
					System.out.println("이름,국어,영어,수학 입력");
					gradeService.add(new GradeBean(scanner.next(),
							scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
			}
			
			break;
			case 2:
				GradeBean[] grades = gradeService.getGrades();
				for(int i=0;i<3;i++) {
				
				System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
						grades[i].getName(), 
						grades[i].allsum(), grades[i].average(), grades[i].grade()));
				}
				break;
			case 3:
				System.out.println("총점별로 1,2,3등 이름 나열하기");
				break;
			case 4:
				for(int i=0;i<3;i++) {
					members[i] = join(scanner);
					MemberBean member = members[i];
					System.out.println(String.format("이름: %s, 아이디: %s 패스워드: %s 나이: %d",
										member.getName(),member.getUserid(),member.getPasswd(),member.getAge()));
				}
				break;
			}
		}
	}
	public static GradeBean input(Scanner scanner) {
		System.out.println("이름,국어,영어,수학 입력");
		return new GradeBean(scanner.next(),
				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		
	}
	public static MemberBean join(Scanner scanner) {
		MemberBean member = new MemberBean();
		System.out.println("이름 입력");
		member.setName(scanner.next());
		System.out.println("아이디 입력");
		member.setUserid(scanner.next());
		System.out.println("패스워드 입력");
		member.setPasswd(scanner.next());
		System.out.println("나이 입력");
		member.setAge(scanner.nextInt());
		return member;
	}

}