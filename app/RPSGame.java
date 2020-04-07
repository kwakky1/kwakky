package com.jse.app;
import java.util.Scanner;
import java.util.Random;
public class RPSGame {
	private int uValue;
	private int cValue;
		public void setUValue(int uValue) {
			this.uValue = uValue;
		}
		public int getUValue(int uValue) {
			return uValue;
		}
		public void setCValue(int cValue) {
			this.cValue = cValue;
		}
		public int getCValue(int cValue) {
			return cValue;
		}
	public String game1() {
		String b ="";
		switch(uValue) {
		case 1: b="가위"; break;
		case 2:b="바위"; break;
		case 3:b="보"; break;
		}
		String uresult = "사용자의 값은 "+b+"입니다.";
		return uresult;
	}
	public String game2() {
		String d ="";
		switch(cValue) {
		case 1: d="가위"; break;
		case 2:d="바위"; break;
		case 3:d="보"; break;
		}
		String cresult ="컴퓨터의 값은 "+d+"입니다.";
		return cresult;
	}
		public String game() {
		String result ="";
		if(uValue==1) {
			switch(cValue) {
			case 1:
			result = "비겼습니다.";
			break;
			case 2:
			result ="졌네요. 컴퓨터 승!";
			break;
			case 3:
			result ="이겼습니다.";
			break;
		}
		}
		else if(uValue==2){
			switch(cValue) {
			case 1:
			result ="이겼습니다.";
			break;
			case 2:
			result ="비겼습니다.";
			break;
			case 3:
			result ="졌네요. 컴퓨터 승!";
			break;
		}
		} else if(uValue==3) {
			switch(cValue) {
			case 1:
			result ="졌네요. 컴퓨터 승!";
			break;
			case 2:
			result ="이겼습니다.";
			break;
			case 3:
			result ="비겼습니다.";
			break;
		}
		
		}
		return result;
		}
	}
