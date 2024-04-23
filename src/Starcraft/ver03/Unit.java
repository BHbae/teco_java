package Starcraft.ver03;

/**
 * public protected -- 상속관계 설정할수 있다. default private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	// get, set - 단축기 (알트 + 쉬프트 + s)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 저글링이 마린을 공격합니다. attckMarin
	public void attck1(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
		m.beAttacket(this.power);
	}

	// 저글링이 질럿을 공격합니다. attckZealot
	public void attck1(Zealot z) {
		System.out.println(this.name + "이" + z.getName() + "을 공격합니다.");
		z.beAttacket(this.power);
	}

	// 마린이 질럿을공격합니다.attcjZergling
	public void attck(Zealot z) {
		System.out.println(this.name + "이" + z.getName() + "을 공격합니다.");
		z.beAttacket(this.power);
	}

	// 마린이 저글링을 공격합니다. attckZergling
	public void attck(Zergling zg) {
		System.out.println(this.name + "이" + zg.getName() + "을 공격합니다");
		zg.beAttacket(this.power);
	}

	// 질럿이 저글링을 공격합니다.
	public void attck1(Zergling z) {
		System.out.println(this.name + "이" + z.getName() + "를 공격합니다.");
		z.beAttacket(this.power);
	}

	// 질럿이 마린을 공격 합니다.
	public void attck(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "를 공격합니다.");
		m.beAttacket(this.power);
	}

	// 자신이 공격을 당합니다
	public void beAttacket(int power) {
		// 방어적 코드
		if (hp <= 0) {
			System.out.println("[" + this.name + "]이미사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

	public void showInfo() {
		System.out.println("===== 상태창 =====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
