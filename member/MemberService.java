package com.jse.member;

	public interface MemberService {
		public void add(Member member);
		public Member[] list();
		public Member[] searchByName(String name);
		public Member[] searchByGender(String gender);
		public Member detail(String userId);
		public int count();
		public int count(String name);
		public int countGender(String gender);
		public Member login(Member member);
		public void update(Member member);
		public void delete(Member member);
	}
