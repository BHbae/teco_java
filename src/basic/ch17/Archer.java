package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println("궁수가 기본공격을합니다");
		super.attack();
	}
	
	void firtArrow() {
		System.out.println(name + "불화살을 쏜당");

	}
	

}
