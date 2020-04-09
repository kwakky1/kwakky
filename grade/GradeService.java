package com.jse.grade;

public interface GradeService {
	public void setGrades(Grade[] grades);
	public Grade[] getGrades();
	public void add(Grade grade);
	public int allsum(Grade grade);
	public int average(Grade grade);
	public String record(Grade grade);
	public String printGrades(Grade grade);
	public void setCount(int count);
	public int getCount();
	public String ranking();
}
