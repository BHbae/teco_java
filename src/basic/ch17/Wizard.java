package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp); // 부모 생성자 호출
	}

	@Override
	public void attack() {
		System.out.println("마법사가 기본공격을한다");
		super.attack();
	}

	void freeZing() {
		System.out.println("얼음마법을 쏜당");
	}

}
