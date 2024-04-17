package basic.ch10;

// 은행
public class Bank {
	// 아무것도 지저아지 않으면 default 제어 지시자
	// private 클래스안에서만 사용이 가능
	private String name;
	private int balancee; // 정보 은닉 --> 외부에서 확인이 안되는 중요한 변수를 감춘다.

	// 입금하다
	public void deposit(int money) {
		balancee = balancee + money;
		showInfo();
	}

	// 출금하다,
	public int withdraw(int money) {
		// 방어적 코드를 작성
		if (balancee < money) {
			System.out.println("잘못된요청입니다.");
			return 0;
		}
		balancee = balancee - money;
		showInfo();
		return money;
	}

	// 현재 은행의 총잔액을 출력 하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balancee + "입니다.");
	}
	// 정보 은닉 후에 getter, setter 메서를 설계 해 둘수 있다.
	// get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드 이다.
	public int getBalance() {
		return this.balancee;
	}
	public String getName() {
		return this.name;
	}
	// setter 멤버 변수에 접근해서 객체의 강태 밧을 변경하게 하는 메서드 (리턴타입없음)
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setBalance(int money) {
		// 방어적 코드 작성하기
		if (money < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.balancee = money;
		}
	}

}// end of class
