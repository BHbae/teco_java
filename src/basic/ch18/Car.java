package basic.ch18;

public class Car {

	String name;
	int price;
	Engine engine; // 포함관계

	public Car() {
		// 포함관계 - Composition
		// 객체안에 필요객체를 직접 생성할 경우
		// Composition 관계라고한다.
		engine = new Engine();
		// Car 라는 객케가 생성이될떄
		// Engine 객체도 함께 생성이된다.
	}

	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발합니다");
	}

	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다");
	}
}
