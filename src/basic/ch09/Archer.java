package basic.ch09;

public class Archer {

	String name; // 이름
	int attackPower;// 공격력
	int archerHp;// 체력

	// 생성자
	public ArcherName(String Name){
		name = Name;
	}attackPower=Att;archerHp=Hp;

	// 체력
	public void beAttacked(int hp) {
		warriorHp = warriorHp - attackPower;

	}

	public void showInfo() {
		System.out.println("닉네임 : " + name);
		System.out.println("남은 체력 : " + warriorHp);
	}

}