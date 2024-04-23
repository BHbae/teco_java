package basic.ch17;

public class Warrior extends Hero{
	
	
	public Warrior(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println(name +"이 망치로 떄린당");
		super.attack();
	}
	
	void comboAttck() {
		System.out.println(name +"이 여러대 떄린당");
		super.attack();
	}

}
