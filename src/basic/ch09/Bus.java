package basic.ch09;

public class Bus {

	int busNumber;
	int passengerCount; // 승객수
	int money; // 수익금

	// 강제성
	public Bus(int number) {
		// 객체 생성시에 제일 먼저 실행되는부분
		busNumber = number;
	}

	// 승객을 태운다.
	public void take(int pay) {
		// money = money + pay;
		money += pay;
		// passengerCount = passengerCount +1;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber + "승차했습니다");
		System.out.println("버스 승객수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}

} // end of class
