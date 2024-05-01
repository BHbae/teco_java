package basic.ch23;

public class Mother extends Thread {

	BankAccont account;

	public Mother(BankAccont account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 5천원 출금 - 다른 작업자에게 위임
		account.withDraw(5000);
	}

}
