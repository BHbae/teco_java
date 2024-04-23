package Starcraft.ver03;

public class StarrcraftTest1 {

	public static void main(String[] args) {
		
		Zealot z1 = new Zealot("질럿1");
		Marine m1 = new Marine("마린1");
		Zergling zg1 = new Zergling("저글링1");
		
		z1.showInfo();
		m1.showInfo();
		zg1.showInfo();
		System.out.println("-----------");
		
		z1.attck(m1);
		zg1.attck(m1);
		
		m1.showInfo();

	}

}
