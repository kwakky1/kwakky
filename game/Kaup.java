package com.jse.game;

//// 개발자님 키와 몸무게를 이용하여 카우푸지수를 구하고 
// 그 결과정상, 저체중 , 비만등으로 
// 몸의 상태만 알려주는 프로그램을 만들어주세요.
// 카우프지수 = 체중(Kg) / 신장(m)2
// 13 < 영양실조
// 13=< ~ <15 : 저체중
// 15=< ~ <18 : 정상
// 18=< ~ <20 : 과체중
// < 20 : 소아비만
public class Kaup {
	private double tall;
	private double weight;

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getTall(double tall) {
		this.tall = tall;
		return tall;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight(int weight) {
		this.weight = weight;
		return weight;
	}
	

	public String result() {
		double c = weight/(tall*tall);
		String kaup1= "";
		if(c<13) { kaup1 ="영양실조";
			
		} else if(c>=13 && c<15) {
			kaup1 ="저체중";
		} else if(c>=15 && c<18) {
			kaup1 ="정상";
		} else if(c>=18 && c<20) {
			kaup1 ="과체중";
		} else if(c>20) {
			kaup1 ="소아비만";
		} else { kaup1 = "잘못된 입력값입니다";}
		return kaup1;

}
}
