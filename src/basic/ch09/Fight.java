package basic.ch09;

import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Archer a1 = new Archer("성후", 100, 500);
		boolean flag = true;
		int choice;
		choice = sc.nextInt();
		
		while (flag) {
			if (choice == 1 ) {
				Warrior w1 = new Warrior("병호", 1000, 1000);
				//w1.beAttacked(15);
				w1.showInfo();
			} else {
				System.out.println("다시 선택해주세요");
			}
			
			
			
		}// end of while
		
		
		
		
		
	} // end of main

} //  end of class
