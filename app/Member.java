package com.jse.app;

public class Member { // 필드
	private String id; // 인스턴스 변수, reference (참조주소)
	public Member() { //생성자, constructor, 에어리어
	}
	public void setId(String id) {
		System.out.println("로컬변수 들어옴"+id);// 매소드 여기 있는 id는 로컬변수 
		this.id = id;
		System.out.println("인스턴스변수에 저장됨 : "+this.id);
	}
	public String getId() { // 매소드 
		return this.id;
	}
	
}
