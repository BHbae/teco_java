package Starcraft.ver02;

public class StarTest {

	public static void main(String[] args) {
		// 질럿2
		Zealot z1 = new Zealot("쫄병질럿1");
		Zealot z2 = new Zealot("쫄병질럿2");
		// 저글링2
		Zergling zg1 = new Zergling("쫄병저글링1");
		Zergling zg2 = new Zergling("쫄병저글링2");
		// 마린 2
		Marine m1 = new Marine("쫄병마린1");
		Marine m2 = new Marine("쫄병마린2");
		
		
		 for (int i = 0; i < 15; i++) {
			 z1.attckMarine(m2);
		 }
		m2.showInfo();
	}

}
