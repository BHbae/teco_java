package basic.ch19;

public class BankTest {
	public static void main(String[] args) {

		Bank bank = new Bank("넝협"); // 독립적인 생명주기를 가진다.
		Customer customer = new Customer("오른"); // 독립적인 생명 주기를 사진다.

		// 연관 관계라고 한다.
		customer.useBankService(bank);
		System.out.println("---------------------------------------");
		// enum type 연습
		bank.providService(ServiceType.ACOUNT_INFO, customer);

	}

}
