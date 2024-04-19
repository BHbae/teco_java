package basic.ch12;

public class Card {

	// 맴버 변수,static 변수
	static int seriaNumber = 200;

	// 생성자
	String name; // 사용자 이름
	private int cardcode; // 카드번호

	// 멤버변수
	public Card(String name) {
		this.name = name;
		this.cardcode = Card.seriaNumber;
		Card.seriaNumber++;
	}

	// get,set 작성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCardcode() {
		return cardcode;
	}

	public void setCardcode(int cardcode) {
		this.cardcode = cardcode;
	}

	// 메인함수
	public static void main(String[] args) {

		Card card1 = new Card("병호");
		System.out.println(card1.getCardcode());
		Card card2 = new Card("성후");
		System.out.println(card2.getCardcode());
		
	}// end of main
}// end of class
