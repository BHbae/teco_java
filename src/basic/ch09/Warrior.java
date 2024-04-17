package basic.ch09;

public class Warrior {
	String name; // 이름
	int attackPower;// 공격력
	int warriorHp;// 체력

	// 생성자
	public Warrior(String Name, int Att, int Hp) {
		name = Name;
		attackPower = Att;
		warriorHp = Hp;
	}

	// 체력
	public void beAttacked(int hp) {
		hp = warriorHp - Archer

	}

	public void showInfo() {
		System.out.println("닉네임 : " + name);
		System.out.println("남은 체력 : " + warriorHp);
	}

}
