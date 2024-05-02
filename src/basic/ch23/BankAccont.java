package basic.ch23;

public class BankAccont {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public synchronized void saveMoney(int money) {
                                 
		
		int currenMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		setMoney(currenMoney + money);

		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금
	public int withDraw(int money) {

		synchronized (this) {
			int cerrenMoney = getMoney();
			/// 출금 0.5초 정도 시간이 걸림

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 방어적 코드 작성
			if (cerrenMoney >= money) {
				setMoney(cerrenMoney - money);
				System.out.println("출금 후 계좌 잔액" + getMoney());
				return money;
			} else {
				System.out.println("잔액이 부족 합니다.");
				return 0;
			}
		}

	}

}
