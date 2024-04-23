package basic.ch19;

public class Customer {

	private String name;

	public Customer(String name) {
		this.name = name;
	}

	// getter
	public String gerName() {
		return name;
	}

	// 은행 서비스를 이용하는 메서드 - 연관 관계
	public void useBankService(Bank bank) {
		bank.providService(ServiceType.DEPOSIT, this);

	}

}
