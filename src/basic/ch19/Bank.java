package basic.ch19;

public class Bank {

	private String name;

	public Bank(String name) {
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	// 대표적인 Bank 기능 , 상호작용 --> 연관계
	public void providService(ServiceType serviceType, Customer customer) {
		switch (serviceType) {
		case ACOUNT_INFO:
			System.out.println(customer.gerName() + "계좌 정보 조회를 합니다.");
			break;
		case DEPOSIT:
			System.out.println(customer.gerName() + "입금을 진행 합니다.");
			break;
		case WITHEDAW:
			System.out.println(customer.gerName() + "출금을 진행 합니다.");
		default:
			System.out.println(customer.gerName() + "해당 서비스는 제공하지 않습니다.");
		}
	}

	// 상호작용
	public void showAccountInfo(Customer customer) {
		System.out.println("사용자 이름을 출력 합니다");
		System.out.println("이름 : " + customer.gerName());
	}
}
