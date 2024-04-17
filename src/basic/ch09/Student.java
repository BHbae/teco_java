package basic.ch09;

public class Student {

	String name;
	int money; // 소지금

	public Student(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}

	// 학생이 버스를 탄다.
	public void TakeBus(Bus bus) {
		// 어떻게 코드를 만들어야 하나?
		bus.take(1500);
		money = money - 1500;
	}

	// 학생이 지하철을 탄다.
	public void Subway(Subway subway) {
		subway.take(1100);
		money = money - 1100;

	}

	// 상태창
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 소지금 : " + money);
	}

} // end of main
