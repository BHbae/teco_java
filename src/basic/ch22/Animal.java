package basic.ch22;

interface Animal {
	// 추상 메서드만 선언 가능
	// public abstract void eat();
	// public abstract void move();

	// 축약 가능
	void eat();

	void move();
}

       // implements - 구현하다
class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("먹이를 먹는다");
	}

	@Override
	public void move() {
		System.out.println("타닥타닥 뛴다");
	}

}

class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("모이를 쫀다");
	}

	@Override
	public void move() {
		System.out.println("푸드덕 거린다");
	}

}
