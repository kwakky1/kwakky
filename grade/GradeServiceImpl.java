package com.jse.grade;

public class GradeServiceImpl implements GradeService{


	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	@Override
	public Grade[] getGrades() {
		return grades;
	}
	@Override
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}
	@Override
	public int allsum(Grade grade) {
		// TODO Auto-generated method stub
		return grade.getKorean() +grade.getEnglish()+grade.getMath();
	}
	@Override
	public int average(Grade grade) {
		return allsum( grade) / 3;
	}
	@Override
	public String record(Grade grade) {
		String result = "F";
		switch (average(grade) / 10) {
		case 5:
			result = "E";
			break;
		case 6:
			result = "D";
			break;
		case 7:
			result = "C";
			break;
		case 8:
			result = "B";
			break;
		case 9:
			result = "A";
			break;
		}
		return result;
	}

	@Override
	public String printGrades(Grade grade) {
		String result = "";
		Grade[] grades = getGrades();
		for(int i=0;i<3;i++) {
			result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]\n",
					grades[i].getName(), 
					allsum(grades[i]), average(grades[i]),record(grades[i]));
		}
		return result;
	}
		
	@Override
	public String ranking() {
		grades = getGrades();
		int a = allsum(grades[0]);
		int y = allsum(grades[1]);
		int z = allsum(grades[2]);
		if (a > y && a>z) {
			if (y > z ) {
				System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[2].getName());
			} else if (z > y) {
				System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[1].getName());
			}
		} else if (y > a && y>z) {
			if (a > z) {
				System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[2].getName());
			} else if (z > a) {
				System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[0].getName());
			}
		} else if (z > y && z>a) {
			if (y > a) {
				System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[0].getName());
			} else if (a > y) {
				System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[1].getName());
			}
		}
		return null;
	}


}
