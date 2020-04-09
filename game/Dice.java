package com.jse.game;

public class Dice {
		private String first;
		private String second;
		
	public void setFirst(String first) {
		this.first = first;
		}
	public String getFirst() {
		return first;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getSecond() {
		return second;
	}
	public String dice() {
		if(first.equals(second)) {
			return "맞습니다.";
	} else {
		return "땡 다음기회에 :)";
			}
		}
	}