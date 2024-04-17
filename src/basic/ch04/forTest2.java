package basic.ch04;

public class forTest2 {

	public static void main(String[] args) {
		
		// 화면에 구구단 2단을 출력하시오.
		int num =2;
		System.out.println(num + " * 1 = " + (num*1));
		System.out.println(num + " * 2 = " + (num*2));
		System.out.println(num + " * 3 = " + (num*3));
		System.out.println(num + " * 4 = " + (num*4));
		System.out.println(num + " * 5 = " + (num*5));
		System.out.println(num + " * 6 = " + (num*6));
		System.out.println(num + " * 7 = " + (num*7));
		System.out.println(num + " * 8 = " + (num*8));
		System.out.println(num + " * 9 = " + (num*9));
		System.out.println("---------------------------------------------");
	
		// 화면에 구구단 3단을 출력하시오.
		num = 3; //변수에 효용 (언제든 접근해서 활용 가능)
		
		System.out.println(num + " * 1 = " + (num*1));
		System.out.println(num + " * 2 = " + (num*2));
		System.out.println(num + " * 3 = " + (num*3));
		System.out.println(num + " * 4 = " + (num*4));
		System.out.println(num + " * 5 = " + (num*5));
		System.out.println(num + " * 6 = " + (num*6));
		System.out.println(num + " * 7 = " + (num*7));
		System.out.println(num + " * 8 = " + (num*8));
		System.out.println(num + " * 9 = " + (num*9));
		
		System.out.println("----------------------------------");
		//화면에 구구단 4단을 출력하시오
		num = 4 ;
		System.out.println(num + " * 1 = " + (num*1));
		System.out.println(num + " * 2 = " + (num*2));
		System.out.println(num + " * 3 = " + (num*3));
		System.out.println(num + " * 4 = " + (num*4));
		System.out.println(num + " * 5 = " + (num*5));
		System.out.println(num + " * 6 = " + (num*6));
		System.out.println(num + " * 7 = " + (num*7));
		System.out.println(num + " * 8 = " + (num*8));
		System.out.println(num + " * 9 = " + (num*9));
		
		System.out.println("------------------------");
		//화면에 구구단 5단을 출력하시오
		num = 5;
		// 1~9 -> 아홉번 반복 하는 for 구문 이다
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i +  " = " + (num*i));
			
		} //end of for
		System.out.println("-------------------------");
		
		
		// 6단을 출력하시오
		num = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = "+ (num*i));
		}//end of for
		
		System.out.println("-------------------------------");
		// 7단을 출력하시오
		num = 7;
		for(int i = 1; i <10 ; i++) {
			System.out.println(num + " * " + i + " = "+ (num*i));
		}//end of for
		
		System.out.println("-------------------------------");
		// 8단을 출력하시오
		num = 8;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		} // end of for
		
		System.out.println("-------------------------------");
		num = 9;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		} //  end of for
		
			
		

	} // end of main

} // end of class
