package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("오른", 100);
		Archer archer1 = new Archer("징크스", 100);
		Wizard wizard1 = new Wizard("빅토르", 100);
		
		warrior1.attack();

	}

}
