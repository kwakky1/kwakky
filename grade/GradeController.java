package com.jse.grade;
import com.jse.member.Member;
import javax.swing.JOptionPane;
import com.jse.util.Constants;


public class GradeController {
// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		Member[] members = new Member[3];
		Grade grade = null;
		while (true) {
			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":return;
			case "1":
				for(int i=0;i<3;i++) {
					String[] values=JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
			}
			break;
			case "2": JOptionPane.showInputDialog(null, gradeService.printGrades(grade));
				break;
			case "3":
				Grade[] grades1 = gradeService.getGrades();
				System.out.println("총점별로 1,2,3등 이름 나열하기");
				break;
			}
		}
	}
}

	
//	public static String score(Grade[] grades) {
//		Grade a = grades[0];
//		Grade b = grades[1];
//		Grade c = grades[2];
//		String rank = "";
//		// ABC O, ACB O, BACO, BCAO, CAB O, CBA O
//		//System.out.println(a.allsum()+" "+b.allsum()+" "+c.allsum());
//		if (a.allsum() > b.allsum()) {
//			if(a.allsum()>c.allsum()) {
//				if(b.allsum()>c.allsum()) {
//					rank =a.getName()+b.getName()+c.getName();
//				} else {
//					rank =a.getName()+c.getName()+b.getName();
//				}
//			}
//		} else if(a.allsum()<c.allsum()) {
//			rank =c.getName()+a.getName()+b.getName(); 
//		}
//		if (a.allsum()<b.allsum()) {
//			if(a.allsum()>c.allsum()) {
//				rank =b.getName()+a.getName()+c.getName(); 
//			}
//		} else if(a.allsum()<c.allsum()) {
//			if(a.allsum()<c.allsum()) {
//				rank=b.getName()+c.getName()+a.getName(); 
//			} else {
//				rank=c.getName()+b.getName()+a.getName();
//			}
//		}
//		return rank;
//		}

