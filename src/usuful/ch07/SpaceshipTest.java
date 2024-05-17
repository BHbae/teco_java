package usuful.ch07;

import usuful.ch07.Spaceship.Engine;

public class SpaceshipTest {

	public static void main(String[] args) {

		Spaceship spaceship = new Spaceship();
		spaceship.startSpaceShip();
		// 외부에서 엔진을 만들어서 spaceship 주입 시켜야된다.

		Engine 빵빵호1번엔진 = new Engine();
		Engine 빵빵호2번엔진 = new Spaceship.Engine();
		Engine 빵빵호3번엔진 = new Spaceship.Engine();
		// 변수명은 한글로 작성하지 맙시다!
		System.out.println("------------------------");
		spaceship.addEngine(빵빵호3번엔진);
		spaceship.startSpaceShip();

		// 사용하는 이유
		// [논리적인 그룹화]
		// 정적 내부 클래스는 외부 클래스와 논리적으로 관련 있는 클래스들을 그룹화 하는데 유용하다.
	}

}
