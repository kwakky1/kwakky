package com.jse.arr;

public class KService {
	private KBean[] cards;
	private int count;
	public KService() {
		cards = new KBean[3];
		count =0;
	}
	public void setCards(KBean[] cards) {
		this.cards = cards;
	}
	public KBean[] getCards() {
	return cards;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
	return count;
	}
		public void add1(KBean card) {
		cards[count] = card;
		count++;
	}
}
