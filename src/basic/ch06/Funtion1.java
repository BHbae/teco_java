package basic.ch06;

// 자의 모든 코드는 class xxx {} 블록안에 코드를 작성 하기로 약속 되어있다.
public class Funtion1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		add(10, 10);
		int result = calcSum(7, 200);
		System.out.println(result);
		
	}// end of main
	
	static int add(int n1, int n2) {
		int result;
		result = n1 +n2;
		return result;
		
	}
	// 연습 문제
	// 함수를 수정 --  파라메터 정수 2개 받을수 있도록 설계
	// s1, s2 -->
	//1, 10 ---> 55
	// 7, 200 ---> 7 + 8 + 9 . .
	static int calcSum(int n1, int n2) {
		int sum = 0;
		int i;
		for (i = n1; i <= n2; i++) {
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 
		}
	
		return sum;

	} // end of main
} // end of class
