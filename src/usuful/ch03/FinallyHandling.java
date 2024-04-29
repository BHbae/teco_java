package usuful.ch03;

import java.util.Scanner;

public class FinallyHandling {

	public static void main(String[] args) {
		
		// try - catch - finally 
		// 언제 finally 상용해야하나?
		// 자원을 반드시 닫아 주어야 할 때 등등....
		Scanner scaneer = new Scanner(System.in);
		
		try {
			int result = scaneer.nextInt(); 
			System.out.println("result : " + result);
		} finally {
			scaneer.close();
			System.out.println("자원 해제");
		}
		
		

	} // end of main

} // end of class


