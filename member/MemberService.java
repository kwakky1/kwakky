package com.jse.member;

	public interface MemberService {
		public void setMembers(Member[] members);
		public Member[] getMemebers();
		public Member login(Member member);
		public void add(Member member);

	}
