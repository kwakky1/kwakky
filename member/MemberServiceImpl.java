package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	

	@Override
	public Member[] list() {
		return members;
	}
	
	@Override
	public Member[] searchByName(String keyword) {
		Member[] search = null;
		int searchCount= count(keyword);
		if(searchCount!=0) {
			search = new Member[count(keyword)];
			int j =0;
			for(int i=0;i<members.length;i++) {
				if(keyword.equals(members[i].getName())){
					search[j] = members[i];
					j++;
					if(searchCount==j) {
						break;
					}
				}
			}	
		}
		return search;
	}
	
	@Override
	public Member detail(String userid) {
		Member detail = null;
		for(int i=0;i<members.length;i++) {
			if(userid.equals(members[i].getUserid())){
				detail = new Member();
				detail = members[i];
				break;
			}
		}
		
		return detail;
	}
	
	@Override
	public int count() {
		return count;
	}
	
	@Override
	public int count(String name) {
		int returncount =0;
		for(int i=0; i<members.length;i++) {
			if(name.equals(members[i].getName())) {
				returncount++;
			}
		}
		return returncount;
	}

	
	@Override
	public Member login(Member member) {
		Member log = null;
		for(int i=0;i<members.length;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())){
				log = new Member();
				log = members[i];
				break;
			} 
		}
		return log;
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub
		
	}



	
}