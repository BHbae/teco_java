package Starcraft.ver02;

import java.util.Scanner;

public class StarTest2 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZEARGLING = 3;
		final int GAME_END = 0;
		
		Gateway gw1 = new Gateway(1);
		Gateway gw2 = new Gateway(2);
		
		Zealot z1 = gw1.createZealot("질럿1");
		Zealot z2 = gw1.createZealot("질럿2");
		System.out.println(gw1.getGateWayNumber() + " : " + gw1.getCount());
		System.out.println(gw2.getGateWayNumber() + " : " + gw2.getCount());
		
		Hatchery h1 = new Hatchery(1);
		Hatchery h2 = new Hatchery(2);
		
		Zergling zg1 = h2.createZegling("저글링1");
		Zergling zg2 = h2.createZegling("저글링2");
		System.out.println(h1.getHatchery() + "에서" + h1.getCount() + "생산");
		System.out.println(h2.getHatchery() + "에서" + h2.getCount() + "생산");
		
				
		Scanner sc = new Scanner(System.in);
		int unitChice = -1;
		
		
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChice = sc.nextInt();
			
			if (unitChice == ZEALOT) {
				
			} else if(unitChice == MARINE) {
				
			} else if(unitChice == ZEARGLING) {
				
			} else {
				System.out.println("프로그램을 종료 합니다.");
				unitChice = GAME_END;
			}

		}	while(unitChice != GAME_END);
		
		
	
		//while <, do while
		// while --> 조건식을 확인하고 코드를 수행
		// do while --> 무조건 한번은 수행하고 다시 조건을 확인
		
		
		
		
		
	}//end of main

}//end of class
