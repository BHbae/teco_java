package usuful.ch05;

/**
 * 쓰레드를 추가하는 방법 - 상속을 활용 할 수 있다. Thread --> Runnable --> run()
 */
public class MyThread extends Thread {

	// 우리가 정의한 클래스에서 run() 메서드 재정의 할 수 있다.
	// 쓰레드를 사용할 떄 알아야 하는 필수 개념 - 필수외움!
	// 쓰레드가 가지고 있는 메서드 start() 호출시키면약속으로
	// run() 메서더 호출되어 동작하게 만들어져있다.
	@Override
	public void run() {
		// 우리가 동작 시키고자 하는 일을 정의 해서 코드를 설계 할 수 있다.
		// 임무 -> 반복문 200번을 수행하라
		for (int i = 0; i < 200; i++) {
			System.out.println(i + ", ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

} // end of class
