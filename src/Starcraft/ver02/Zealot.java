package Starcraft.ver02;

public class Zealot {
	
	private String name;
	private int power;
	private int hp;
	
	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}
	// getter
	public String getName() {
		return name;
	}
	public int getPower() {
		return power;
	}
	
	public int getHp() {
		return hp;
	}
	
	// 질럿이 저글링을 공격합니다.
	public void attck(Zergling z) {
		System.out.println(this.name + "이" + z.getName() + "를 공격합니다.");
		z.beAttacket(this.power);
	}
	
	// 질럿이 마린을 공격 합니다.
	public void attck(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "를 공격합니다.");
		m.beAttacket(this.power);
	}
	
	// 자신이 공격을 당합니다.
	public void beAttacket(int power) {
		//방어적 코드
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
	public void attckMarine(Marine m2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
