package com.jse.inheritance;

public class CellPhone extends Phone {
	private boolean portable;
	private String move;
	public CellPhone(String phoneNumber, String name, String company,boolean portable) {
		super(phoneNumber, name, company);
		this.portable=portable;
		setPortable(portable);
	}
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable) {
			this.move="휴대가능";
		}else {
			this.move="휴대불가능";
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	@Override
	public String toString() {
		return "CellPhone [portable=" + portable + ", move=" + move + "]";
	}
	
}