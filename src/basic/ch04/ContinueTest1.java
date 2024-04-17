package basic.ch04;

public class ContinueTest1 {
	//코드의 시작점
	public static void main(String[] args) {
		
		// 1부터 100 까지 숫자중에 3의 배수를 출력하세요
		//1~100 --> 반복적인 패천이 보임
		// 만약 3의 배수라면 화면에 숫자를 출력 하세요
		// 반복문은 for 을 사용 하자.
		
		for(int i = 1; i < 101; i++ ) {
			if((i % 3) ==0 ) {
				
				System.out.println("답 : " + i);
			} // end of if
			
		} // enf of for
		
		

	}// end of main

} // end of class
