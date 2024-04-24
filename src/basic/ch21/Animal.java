package basic.ch21;

public abstract class Animal {

	String name;

	public void move() {
		System.out.println("동물이 이동을 한다.");
	}

	// 하나 이상의 추상 메서드가 있다면 . . .

	// 추상 메서드--> 메서드의 선언부만 존재 + abstract

	public abstract void hunt();
	// 추상 메서드를 초함 하는 클래스는 반드시 추상 클래스가
	// 되어야 한다

	// 코드테스트

}
