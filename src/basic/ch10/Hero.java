package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getIsdie() {
		return this.isDie;
	}
	
	public void setNmae(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setDefense(Double defense) {
		this.defense = defense;
	}
	public void setIsdie(boolean isDie) {
		this.isDie = isDie;
	}
	public void inFo() {
		System.out.println(this.name);
		System.out.println(this.hp);
		System.out.println(this.power);
		System.out.println(this.defense);
		if (isDie == true) {
			System.out.println();
		}
	}

}// end of class
