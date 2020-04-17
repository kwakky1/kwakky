package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
		count =0;
	}
	@Override
	public void add(Member member) {
		members[count]= member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] search=null;
		int searchCount = count(name);
		if(searchCount!=0) {
			search = new Member[searchCount];
			int j=0;
			for(int i=0;i<count;i++) {
				if(name.equals(members[i].getName())) {
					search[j]=members[i];
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
	public Member[] searchByGender(String gender) {
		Member[] genderCheck = null;
		int gendercount = countGender(gender);
		if(gender.equals("남성")) {
			genderCheck = new Member[gendercount];
			char a = '0';
			int j =0;
			for(int i=0;i<count;i++) {
				a = members[i].getSsn().charAt(7);
				if(a=='1'||a=='3') {
					genderCheck[j] = members[i];
					j++;
					if(gendercount==j) {
						break;
					}
				}
			}
		} else if(gender.equals("여성")) {
			genderCheck = new Member[gendercount];
			char a = '0';
			int j =0;
			for(int i=0;i<count;i++) {
				a = members[i].getSsn().charAt(7);
				if(a=='2'||a=='4') {
					genderCheck[j] = members[i];
					j++;
					if(gendercount==j) {
						break;
					}
				}
			}
		}else {
			genderCheck = new Member[gendercount];
			char a = '0';
			int j =0;
			for(int i=0;i<count;i++) {
				
				a = members[i].getSsn().charAt(7);
				if(a=='5'||a=='6') {
					genderCheck[j] = members[i];
					j++;
					if(gendercount==j) {
						break;
					}
				}
			}
		}
		return genderCheck;
	}
	
	@Override
	public int count(String name) {
		int recount=0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				recount++;
			}
		}
		return recount;
	}

	@Override
	public int countGender(String gender) {
		int count1 = 0;
		char a ='0';
		if(gender.equals("남성")) {
			for(int i=0; i<count;i++) {
				a = members[i].getSsn().charAt(7);
				if(a=='1'||a=='3') {
					count1++;
				}
			}
		} else if(gender.equals("여성")) {
			for(int i=0; i<count;i++) {
				a = members[i].getSsn().charAt(7);
				if(a=='2'||a=='4') {
					count1++;
				}
			}
		} else if(gender.equals("외국인")) {
			for(int i=0; i<count;i++) {
				a = members[i].getSsn().charAt(7);
				if(a=='5'||a=='6') {
					count1++;
				}
			}
		}
		return count1;
	}


	@Override
	public Member detail(String userId) {
		Member detail = null;
		for(int i=0;i<count;i++) {
			if(userId.equals(members[i].getUserid())) {
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
	public Member login(Member member) {
		Member log=null;
		for(int i=0;i<count;i++) {
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
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
		
	}

	@Override
	public void delete(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
			&& member.getPasswd().equals(members[i].getPasswd())) {
				members[i]=members[count-1];
				members[count-1] = null;
				count--;
			}

		}
	}
	
}
